package com.learn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.models.User;
import com.learn.services.UserService;

@RestController
@RequestMapping("/users/")
public class UserController {
	
	@Autowired
	UserService userService;

	
	
	//all users
	@GetMapping("/")
	public List<User> getAllUsers()
	{
		return userService.getAllUser();
	}
	
	//single user
//	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/{username}")
	public User getSingleUser(@PathVariable("username") String username)
	{
		return userService.getUser(username);
	}
	
	
	//add user
	@PostMapping("/")
	public User add(@RequestBody User user)
	{
		return this.userService.addUser(user);
	}
}
