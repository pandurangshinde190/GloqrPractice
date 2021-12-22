package com.dev.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.springboot.model.Employee;
import com.dev.springboot.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void save(Employee employee) {
		employeeRepository.save(employee);
		
	}
	

	public List<Employee> getAllEmployeeData() {
		return employeeRepository.findAll();
	}

}
