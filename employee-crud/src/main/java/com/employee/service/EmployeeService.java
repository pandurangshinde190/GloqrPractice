package com.employee.service;

import java.util.List;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;

public interface EmployeeService {

	void insert(EmployeeDto employee);
	void deleteEmployee(String employeeId);
	EmployeeDto getEmployeeData(String employeeUuid);
	List<EmployeeDto> getEmployeeAllData();
	void updateEmployeeData(EmployeeDto employeeDto);


}