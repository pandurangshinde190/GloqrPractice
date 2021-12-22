package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/userServiceFallback")
	public String UserServiceFallback()
	{
		return "User service is down at this time!!";
		
	}
	
	@GetMapping("contactServiceFallback")
	public String ContactServiceFallback()
	{
		return "Contact service is down at this time!!";
		
	}
	
	
	
}
