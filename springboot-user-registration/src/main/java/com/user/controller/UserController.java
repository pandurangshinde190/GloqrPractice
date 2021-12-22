package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.UserDto;
import com.user.service.UserService;

@RestController
public class UserController {

		@Autowired
		private UserService userService;
		
		@PostMapping("/users")
	    public UserDto createEmployee(@RequestBody UserDto userd) {
	        userService.createUser(userd);
	        return userd;
	    }
		
		
}
