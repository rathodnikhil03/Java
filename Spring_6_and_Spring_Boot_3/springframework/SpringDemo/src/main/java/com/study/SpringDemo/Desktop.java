package com.study.SpringDemo;

public class Desktop implements Computer{
	
	public Desktop() {
		System.out.println("desktop object created");
	}
	public void compile() {
	
		System.out.println("Compiling using Desktop");
	}
}