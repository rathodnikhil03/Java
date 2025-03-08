package com.study.spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.study.spring_security.dao.UserRepo;
import com.study.spring_security.model.User;
import com.study.spring_security.model.UserPrincipal;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		
		User user = repo.findByUsername(username);
		
		if(user == null) {
			System.out.println("User 404");
			throw new UsernameNotFoundException("User 404");
		}
		
		return new UserPrincipal(user);
	}

	
}
