package com.study.project.repository;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.study.project.model.Laptop;

@Repository
public class LaptopRepository {

	public void save(Laptop lap) {
		System.out.println("saving the database..");
		
	}
}
