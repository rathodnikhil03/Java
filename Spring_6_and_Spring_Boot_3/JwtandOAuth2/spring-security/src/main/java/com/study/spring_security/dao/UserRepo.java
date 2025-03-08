package com.study.spring_security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.spring_security.model.User;
import java.util.List;


public interface UserRepo extends JpaRepository<User, Integer>{

	
	User  findByUsername(String username);
}
