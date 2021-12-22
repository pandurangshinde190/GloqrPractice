package com.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@RestController
//@RequestMapping("api/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	
	@PostMapping("/employees")
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employee) {
        employeeService.createEmployee(employee);
        return employee;
    }
	
	
	@GetMapping("/employees")
	public List<EmployeeDto> getAllEmployees() {
		
//		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
		
		return employeeService.getAllEmployees();

	}

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable("id") Long id)
	{
		return employeeService.getOneEmployee(id);
		
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable("id") Long id)
	{ 
		employeeService.delete(id);
		
	}

	@PutMapping("/employees")
	public String updateEmployee(@RequestBody EmployeeDto employees,@RequestParam Long id) {
		
		employeeService.update(employees, id);
		return "Data Update Successfully";
		
	}
	
	

}
