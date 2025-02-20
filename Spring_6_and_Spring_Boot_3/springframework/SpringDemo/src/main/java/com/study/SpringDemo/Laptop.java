package com.study.SpringDemo;

public class Laptop implements Computer{
	
//     public Laptop() {
//    	 System.out.println("Laptop runningm");
//     }
     
     @Override
	public void compile() {
    	 System.out.println("compiling using laptop");
     }
}