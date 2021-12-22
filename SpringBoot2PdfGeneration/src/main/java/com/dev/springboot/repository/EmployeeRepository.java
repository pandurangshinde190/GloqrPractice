package com.dev.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
