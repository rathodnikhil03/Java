package com.studey.ServletEx;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")

public class HelloServlets extends HttpServlet{


	public void service(HttpServletRequest req , HttpServletResponse res){
		 System.out.println("in service");
		 
	 }
}
