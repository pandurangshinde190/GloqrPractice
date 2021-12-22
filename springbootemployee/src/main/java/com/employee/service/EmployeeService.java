package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	
	
	public void createEmployee(EmployeeDto employee) {
		try {
			Employee employee2 = new ModelMapper().map(employee, Employee.class);
			employeeRepository.save(employee2);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		employeeRepository.save(employee);
	}
	
		
	
	public List<EmployeeDto> getAllEmployees() {

		List<EmployeeDto> employee = new ArrayList<EmployeeDto>();
		List<Employee> list = employeeRepository.findAll();
		for (Employee employee2 : list) {
			EmployeeDto emp = new ModelMapper().map(employee2, EmployeeDto.class);
			employee.add(emp);
		}

		return employee;

	}


	public Employee getOneEmployee(Long id) {

		return employeeRepository.findById(id).get();
	}

	public void delete(Long id) {

		employeeRepository.deleteById(id);
	}

	public void update(EmployeeDto employees, long id) {

		try {
			Optional<Employee> e1 = employeeRepository.findById(id);

			if (e1.isPresent()) {
				Employee e2 = e1.get();
				e2.setFirstName(employees.getFirstName());
				e2.setLastName(employees.getLastName());
				e2.setEmailIds(employees.getEmailIds());
				e2.setPhoneNo(employees.getPhoneNo());
				e2.setAddress(employees.getAddress());
				employeeRepository.save(e2);
			} else {
				System.out.println("No Present");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
