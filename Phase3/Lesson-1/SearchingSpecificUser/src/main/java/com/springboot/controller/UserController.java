package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.model.User;
import com.springboot.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String showLoginPage(ModelMap model)
	{
        return "login";
    }
	
	@PostMapping("/login")
	public String getUser(@RequestParam int id, ModelMap model)
	{
		boolean validate = userService.validateUser(id);
		
		if (!validate)
		{
			model.addAttribute("errorMessage", "Invalid ID");
			return "login";
		}
		model.addAttribute("user", userService.getUserById(id));
		
		return "user";
	}
	
	
	@PostMapping("/update")
	public String updateUser(@RequestParam int id, @RequestParam String name, @RequestParam String email, ModelMap model)
	{
		User user = new User(id, name, email);
		
		User updatedUser = userService.updatedUser(user);
		model.addAttribute("user", updatedUser);
		
		return "updated";
	}
}




