package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Learner;
import com.springboot.repository.LearnerRepository;

@Service
public class LearnerService {

	@Autowired
	LearnerRepository learnerRepository;
	
	
    public List<Learner> getAllLearner(){
        return learnerRepository.findAll();
    }
        
    public Learner getLearner(int id){
        return learnerRepository.findById(id).get();
    }
        
    public void addLearner(Learner learner){
    	learnerRepository.save(learner);
    }

}
