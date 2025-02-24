package com.study.JobApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.JobApp.model.JobPost;
import com.study.JobApp.service.JobServics;
import org.springframework.ui.Model;



@Controller
public class JobController {

	@Autowired
	private JobServics service;
	
	@RequestMapping({"/","home"})
	 public String home() {
		 return "home";
	 }
	
	@GetMapping("addjob")
	 public String addJob() {
		 return "addjob";
	 }
	
	@PostMapping("handleForm")
	public String handleForm(JobPost jobPost) {
		service.addJob(jobPost);
		return "success";
	}
	
	@GetMapping("viewalljobs")
	public String viewJobs(Model m) {
		List<JobPost> jobs = service.getAllJobs();
		m.addAttribute("jobPosts", jobs);
		return "viewalljobs";
	}
}
