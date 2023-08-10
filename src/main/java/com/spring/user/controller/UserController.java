package com.spring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.user.model.User;
import com.spring.user.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired(required = false)
	private UserRepository repository;

	

	@PostMapping("/adduser")
	public String saveBook(@RequestBody User user) {
		repository.save(user);
		return "added user with id : " + user.getId();
	}
	
	
}
	

