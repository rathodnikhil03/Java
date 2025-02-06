package com.study.javabasedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	@Value("35")
	private int age;
	// Field Injection (private Computer com;), Constructor (public Alien(){}), Setter (public void setCom(Computer com) {this.com = com;})
	//@Qualifier("laptop")              
	private Computer com;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Computer getCom() {
		return com;
	}

	@Autowired
	@Qualifier("laptop")
	public void setCom(Computer com) {
		this.com = com;
	}

	public void code() {
		System.out.println("code is complie");
		com.complie();
	}
}
