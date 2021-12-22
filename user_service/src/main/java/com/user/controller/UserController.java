package com.user.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Autowired
	private UserService userService;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId)
	{
		User user = userService.getUser(userId);
		
//		http://localhost:9002/contact/user/789
//		List<Contact> contacts = this.restTemplate.getForObject("http://localhost:9002/contact/user/"+user.getUserId(), List.class);

		List<Contact> contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(), List.class);


		user.setContacts(contacts);
		
		return user;
		
	}
	
}
