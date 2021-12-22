package com.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.employee.http.response.CustomHttpResponse;
import com.employee.service.EmployeeService;
import com.employee.util.ResponseMaker;

@RestController
@CrossOrigin("*")
@RequestMapping("emp/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private ResponseMaker responseMaker;
	
	//Insert the employee data
	@PostMapping("/employees")
	public ResponseEntity<CustomHttpResponse<String>> insert(@RequestBody EmployeeDto employee) {
		employeeService.insert(employee);
		return responseMaker.successResponse("Employee Record Saved Successfully.", HttpStatus.CREATED);
	}
	
	//delete the employee data
	@DeleteMapping("employees/{employeeUuid}")
	public ResponseEntity<CustomHttpResponse<String>> deleteEmployee(@PathVariable("employeeUuid") String  employeeUuid )
	{
		employeeService.deleteEmployee(employeeUuid);
		return responseMaker.successResponse("Employee Record Deleted Successfully", HttpStatus.OK);
		
	}
	
	
	//Get the particular employee data
	@GetMapping("employees/{employeeUuid}")
	public ResponseEntity<CustomHttpResponse<EmployeeDto>> getEmployeeData(@PathVariable("employeeUuid") String employeeUuid)
	{
		
//		return responseMaker.successResponse(employeeService.getEmployeeData(employeeUuid), HttpStatus.OK);
		EmployeeDto employeeDto = employeeService.getEmployeeData(employeeUuid);
		return responseMaker.successResponse(employeeDto, HttpStatus.OK);
	}
	
	@GetMapping("employees")
	public ResponseEntity<CustomHttpResponse<List<EmployeeDto>>>getEmployeeAllData()
	{
		List<EmployeeDto> employeeDto=new ArrayList<EmployeeDto>();
		 employeeDto=employeeService.getEmployeeAllData();
		return responseMaker.successResponse(employeeDto, HttpStatus.OK);
		
	}
	
	@PutMapping("employees")
	public ResponseEntity<CustomHttpResponse<String>> updateEmployeeData(@RequestBody EmployeeDto employeeDto)
	{
		employeeService.updateEmployeeData(employeeDto);
		return responseMaker.successResponse("Employee Data Updated Successfully", HttpStatus.OK);
		
	}
	
	

	
	
	
}
