package com.spring.learner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnerController {

	@Autowired
	private LearnerService service;
	
	@GetMapping("list")
	public List<Learner> getDetails()
	{
		return service.getLearners();
	}
	
	@GetMapping("list/{id}")
	public Optional<Learner> getLearnerById(@PathVariable int id)
	{
		return service.getLearnerById(id);
	}
	
	@PostMapping("list")
	public void addLearner(@RequestBody Learner learner)
	{
		service.addLearner(learner);
	}
	
	@PutMapping("list/{id}")
	public void updateLearner(@RequestBody Learner learner, @PathVariable int id)
	{
		service.updateLearner(learner, id);
	}
	
	@DeleteMapping("list/{id}")
	public void deleteLearner(@PathVariable int id)
	{
		service.deleteLearner(id);
	}
	
}




















