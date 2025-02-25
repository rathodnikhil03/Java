package com.study.sping_boot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.sping_boot_rest.model.JobPost;
import com.study.sping_boot_rest.repo.JobRepo;



@Service
public class JobService {

	@Autowired
	private JobRepo repo;
	
	 public void addJob(JobPost jobPost) {
		 repo.addJob(jobPost);
	 }
	 
	 public List<JobPost> getAllJobs(){
		 return repo.getAllJobs();
	 }
}
