package com.study.SpringBootWeb1;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

	public String home() {
		System.out.println("HelloController is called");
		return "index.jsp";
	}
}
