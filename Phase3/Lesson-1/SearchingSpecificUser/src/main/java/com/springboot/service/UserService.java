package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.User;
import com.springboot.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public boolean validateUser(int id)
	{
		return repository.findById(id).isPresent();
	}
	
	
	public User getUserById(int id)
	{
		return repository.findById(id).get();
	}
	
	
	
	public User updatedUser(User user)
	{
		User updatedUser = repository.save(user);
		
		return updatedUser;
	}
	
}
