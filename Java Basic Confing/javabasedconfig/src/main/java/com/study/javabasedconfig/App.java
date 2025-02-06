package com.study.javabasedconfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.jbc.AppConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	
    	Alien a =  context.getBean(Alien.class);
    	System.out.println(a.getAge());
    	a.code();
    	
//    	Desktop desk = context.getBean("desktop" , Desktop.class);
//    	desk.compile();
//    	
//    	Desktop desk1 = context.getBean("desktop" , Desktop.class);
//    	desk1.compile();
    }
}
