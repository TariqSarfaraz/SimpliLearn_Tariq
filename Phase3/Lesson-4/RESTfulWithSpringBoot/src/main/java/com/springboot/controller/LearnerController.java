package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Learner;
import com.springboot.service.LearnerService;

@RestController
public class LearnerController {

	@Autowired
	LearnerService learnerService;
	
	@GetMapping("/alllearner")
	public List<Learner> getAllLearners()
	{
		return learnerService.getAllLearner();
	}
	
	@GetMapping("/learner/{id}")
	public Learner getLearner(@PathVariable int id)
	{
		return learnerService.getLearner(id);
	}
	
	@PostMapping("/addlearner")
	public void addLearner(@RequestBody Learner learner)
	{
		learnerService.addLearner(learner);
	}
}









