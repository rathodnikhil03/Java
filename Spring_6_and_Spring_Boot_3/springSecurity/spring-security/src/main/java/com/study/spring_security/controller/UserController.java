package com.study.spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring_security.model.User;
import com.study.spring_security.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
    @PostMapping("register")
	public User register(@RequestBody User user) {
		return service.saveUser(user);
		
	}
	
}
