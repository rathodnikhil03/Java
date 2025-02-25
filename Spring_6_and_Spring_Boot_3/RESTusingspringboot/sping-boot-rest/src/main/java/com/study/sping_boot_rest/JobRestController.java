package com.study.sping_boot_rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.sping_boot_rest.model.JobPost;
import com.study.sping_boot_rest.service.JobService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

	@Autowired
	private JobService service;
	
	@GetMapping("jobPosts")
	//@ResponseBody
	public List<JobPost> getAllJobs(){
		return service.getAllJobs();
	}
	
	
}
