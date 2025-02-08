package com.study.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
	   ConfigurableApplicationContext context = SpringApplication.run(TodoAppApplication.class, args);
		 
	   Alien obj = context.getBean(Alien.class);
	   obj.code();
	}
								
}
