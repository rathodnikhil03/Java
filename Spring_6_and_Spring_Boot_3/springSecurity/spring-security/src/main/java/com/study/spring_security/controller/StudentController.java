package com.study.spring_security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring_security.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	List<Student> students = new ArrayList<>(List.of(
			
			new Student(1,"Nikhil","Java"),
			new Student(1,"Rahil","Python")
			
			));
	@GetMapping("csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	@GetMapping("students")
	public List<Student> getStudents(){
		return students;
		
	}
	
	@PostMapping("students")
	public void addStudent(@RequestBody Student student){
		students.add(student);
	}
}
