package com.study.SpringMvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@ModelAttribute("course")
	public String courseName() {
		return "Java";
	}
	@RequestMapping("/")
	public String home() {

		System.out.println("HelloController is called");
		return "index";
//		return "index.jsp";
	}

	// remove HttpSession with help of Model Object to get the request object and we
	// also the HttpSrvletRequest with the help of @RequstParam("the name of
	// parameter") it's handle the
	// parameters
	@RequestMapping("add")
	// public String add(@RequestParam("num1") int num, @RequestParam("num2") int
	// nm, Model model)
	public ModelAndView add(@RequestParam("num1") int num, @RequestParam("num2") int nm, ModelAndView mv) {

		int result = num + nm;

		mv.addObject("result", result);
		mv.setViewName("result");
//		model.addAttribute("result", result);

		return mv;
		// return "result.jsp";

	}

	/*
	 * @RequestMapping("add") public String add(HttpServletRequest req ,HttpSession
	 * session) { int num1 = Integer.parseInt(req.getParameter("num1")); int num2 =
	 * Integer.parseInt(req.getParameter("num2")); int result = num1+num2; sevlet
	 * way to solve. session.setAttribute("result", result);
	 * 
	 * return "result.jsp";
	 * 
	 * }
	 */
	
	
	
	/*
	 * @RequestMapping("addAlien") public ModelAndView addAlien(@RequestParam("aid")
	 * int aid, @RequestParam("aname") String aname, ModelAndView mv) {
	 * 
	 * Alien alien = new Alien();
	 * 
	 * alien.setAid(aid); alien.setAname(aname);
	 * 
	 * mv.addObject("alien", alien); mv.setViewName("result");
	 * 
	 * return mv;
	 * 
	 * }
	 */
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien alien) {

		return "result";
	
	}
	
	
	
	
	
	
}
