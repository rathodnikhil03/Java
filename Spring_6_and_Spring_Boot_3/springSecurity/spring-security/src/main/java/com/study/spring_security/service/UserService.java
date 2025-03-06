package com.study.spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring_security.dao.UserRepo;
import com.study.spring_security.model.User;

@Service
public class UserService {
 
	@Autowired
	private UserRepo repo;
	
	public User saveUser(User user) {
		return repo.save(user);
		
	}
	
}
