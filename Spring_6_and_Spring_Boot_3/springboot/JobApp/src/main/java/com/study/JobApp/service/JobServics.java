package com.study.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.JobApp.model.JobPost;
import com.study.JobApp.repo.JobRepo;

@Service
public class JobServics {

	@Autowired
	private JobRepo repo;
	
	 public void addJob(JobPost jobPost) {
		 repo.addJob(jobPost);
	 }
	 
	 public List<JobPost> getAllJobs(){
		 return repo.getAllJobs();
	 }
}
