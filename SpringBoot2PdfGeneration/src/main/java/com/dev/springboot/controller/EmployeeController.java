package com.dev.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.springboot.model.Employee;
import com.dev.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	public String save(Employee employee)
	{
		employeeService.save(employee);
		return "Data added Successfully";
		
	}

}
