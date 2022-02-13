package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Feedback;
import com.springboot.repository.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepository feedbackRepository;
	
//	Method to add new feedback
	public void addFeedback(Feedback feedBack)
	{
		feedbackRepository.save(feedBack);
	}
	
//	Method to get feedback by id
	public Optional<Feedback> getFeedback(int id)
	{
		return feedbackRepository.findById(id);
	}
	
//	Method to get all feedbacks
	public List<Feedback> getDetails()
	{
		return (List<Feedback>) feedbackRepository.findAll();
	}
}
