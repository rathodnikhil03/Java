package com.studey.ServletEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")

public class HelloServlets extends HttpServlet{


	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException{
		 System.out.println("in service");
		 
		 res.setContentType("text/html");
		 
		 PrintWriter out = res.getWriter();
		 out.println("<h2><b>Hello World</b></h2>");
	 }
}
