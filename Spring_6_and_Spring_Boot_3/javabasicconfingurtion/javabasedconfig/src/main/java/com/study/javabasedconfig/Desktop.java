package com.study.javabasedconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary  //primary is less power than qualifier
@Scope("Prototype")
public class Desktop implements Computer {


	@Override
	public void complie() {
		System.out.println("running desktop");
		
	}
}
