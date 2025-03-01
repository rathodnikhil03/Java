package com.study.BackToDo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BackToDoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BackToDoApplication.class, args);
	}

}
