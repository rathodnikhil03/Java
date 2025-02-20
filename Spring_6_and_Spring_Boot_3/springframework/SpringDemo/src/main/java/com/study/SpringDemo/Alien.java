package com.study.SpringDemo;

/*import java.beans.ConstructorProperties;*/

public class Alien {
	
	private int age;
	private Computer com;
	
 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


 
	/*
	 * @ConstructorProperties({"age","lap1"}) public Alien(int age, Computer com) {
	 * super(); System.out.println("para constructor called"); this.age = age;
	 * this.com = com; }
	 */

	public Computer getcom() {
		return com;
	}
	public void setcom(Computer com) {
		this.com = com;
	}


	public void code() {
		System.out.println("code method: Coding");
		com.compile();
	}
}
