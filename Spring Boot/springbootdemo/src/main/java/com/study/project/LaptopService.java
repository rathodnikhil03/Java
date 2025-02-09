package com.study.project;

import org.springframework.stereotype.Service;

@Service
public class LaptopService {

	public void addLaptop(Laptop lap) {
	   System.out.println("method called");
	}

	public boolean isGoodForProg(Laptop lap) {
		
		return true;
	}
	
}
