package com.study.project.model;

 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.study.project.service.LaptopService;

@SpringBootApplication(scanBasePackages = "com.study.project")
public class SpringApp {
 
	public static void main(String[] args) {
	   ConfigurableApplicationContext context = SpringApplication.run(SpringApp.class, args);
		 
	   LaptopService service = context.getBean(LaptopService.class);
	   
 	   Laptop lap =context.getBean(Laptop.class);
	   service.addLaptop(lap);
	   
	   
	   
//	   Alien obj = context.getBean(Alien.class);
//	   System.out.println(obj.getAge());
//	   obj.code();
	}
								
}
