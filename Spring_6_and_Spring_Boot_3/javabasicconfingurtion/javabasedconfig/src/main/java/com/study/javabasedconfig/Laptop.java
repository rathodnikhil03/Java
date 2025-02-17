package com.study.javabasedconfig;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

	@Override
	public void complie() {
		System.out.println("running laptop");
		
	}

	
}
