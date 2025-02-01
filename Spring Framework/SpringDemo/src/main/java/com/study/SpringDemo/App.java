package com.study.SpringDemo;


import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * XML- BAsed Configuration
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
    	
    	Alien a = (Alien) context.getBean("alien");
    	a.code();

    	   
    }
}

