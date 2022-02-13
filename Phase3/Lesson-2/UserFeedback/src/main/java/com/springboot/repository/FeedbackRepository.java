package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Feedback;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Integer>{

}
