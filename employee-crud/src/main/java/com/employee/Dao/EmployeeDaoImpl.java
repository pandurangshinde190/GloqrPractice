package com.employee.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Address;
import com.employee.entity.Employee;
import com.employee.http.exception.CustomException;
import com.employee.http.response.CustomHttpResponse;
import com.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public void saveEmployee(Employee employee) {
		try {
			employeeRepository.save(employee);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}


	@Override
	public void deleteemp(String employeeUuid) {
		try {
			Employee employee= employeeRepository.findByEmployeeUuid(employeeUuid);
			employeeRepository.delete(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	
	@Override
	public EmployeeDto getEmployeeData(String employeeUuid) {
		
		Employee employee=employeeRepository.findByEmployeeUuid(employeeUuid);
		EmployeeDto employeeDto=new ModelMapper().map(employee, EmployeeDto.class );
		return employeeDto;
	}


	@Override
	public List<EmployeeDto> getEmployeeAllData() {
		
		List<EmployeeDto> employeeDto = new ArrayList<EmployeeDto>();
		List<Employee> employees=employeeRepository.findAll();
		
			for (Employee employee : employees) {
				EmployeeDto empDto=new ModelMapper().map(employee, EmployeeDto.class);
				employeeDto.add(empDto);
			}
		
		return employeeDto;
	}


	@Override
	public void updateEmployeeData(EmployeeDto employeeDto) {
		try {
		
			Employee employee= employeeRepository.findByEmployeeUuid(employeeDto.getEmployeeUuid());
//			employee.setAddress(employeeDto.getAddress());
			Address address = employee.getAddress();
			address.setCountry(employeeDto.getAddress().getCountry());
			address.setState(employeeDto.getAddress().getState());
			address.setCity(employeeDto.getAddress().getCity());
			address.setLocality(employeeDto.getAddress().getLocality());
			address.setArea(employeeDto.getAddress().getArea());
			address.setPincode(employeeDto.getAddress().getPincode());
			employee.setAddress(address);
			employee.setEmployeeName(employeeDto.getEmployeeName());
			employee.setDesignation(employeeDto.getDesignation());
			employee.setSalary(employeeDto.getSalary());
			employee.setExperience(employeeDto.getExperience());
			employee.setDepartment(employeeDto.getDepartment());
			employeeRepository.save(employee);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	





}
