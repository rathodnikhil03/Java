package com.study.project;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

	public void complier() {
		System.out.print("Laptop is using..");
		
		}
}
