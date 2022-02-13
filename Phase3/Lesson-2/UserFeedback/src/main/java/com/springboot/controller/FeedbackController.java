package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Feedback;
import com.springboot.service.FeedbackService;

@RestController
public class FeedbackController {

	@Autowired
	FeedbackService feedBackService;
	
	@PostMapping("feedback")
	public void addFeedback(@ModelAttribute Feedback feedBack)
	{
		feedBackService.addFeedback(feedBack);
	}
	
	@GetMapping("feedback/{id}")
	public Optional<Feedback> getFeedback(@PathVariable int id)
	{
		return feedBackService.getFeedback(id);
	}
	
	@GetMapping("feedback")
	public List<Feedback> getDetails()
	{
		return feedBackService.getDetails();
	}
}
