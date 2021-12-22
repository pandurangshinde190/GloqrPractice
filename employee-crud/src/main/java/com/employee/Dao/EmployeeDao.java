package com.employee.Dao;

import java.util.List;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee employee);

	void deleteemp(String employeeUuid);

	EmployeeDto getEmployeeData(String employeeUuid);

	List<EmployeeDto> getEmployeeAllData();

	void updateEmployeeData(EmployeeDto employeeDto);
}
