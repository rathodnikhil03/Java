package com.study.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.study.project.model.Laptop;
import com.study.project.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository repo;

	public void addLaptop(Laptop lap) {
	  repo.save(lap);
	}

	public boolean isGoodForProg(Laptop lap) {
		
		return true;
	}
	
}
