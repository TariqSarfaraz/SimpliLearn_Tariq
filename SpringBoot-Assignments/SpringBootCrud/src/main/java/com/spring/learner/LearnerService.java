package com.spring.learner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LearnerService {

	@Autowired
	private LearnerDao dao;
	
	public List<Learner> getLearners()
	{
		List<Learner> list = new ArrayList<>();
		dao.findAll().forEach(list::add);
		
		return list;
	}
	
	public Optional<Learner> getLearnerById(int id)
	{
		return dao.findById(id);
	}
	
	public void addLearner(Learner learner)
	{
		dao.save(learner);
	}
	
	public void updateLearner(Learner learner, int id)
	{
		dao.save(learner);
	}
	
	public void deleteLearner(int id)
	{
		dao.deleteById(id);
	}
}












