package com.employee.service;



import java.util.List;

import javax.persistence.EntityManager;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Dao.EmployeeDao;
import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;
import com.employee.util.UuidUtil;


@Service
public class EmployeeServiceImp implements EmployeeService {

	private static final Employee Employee = null;
	

	
	
	@Autowired
	private EmployeeDao employeeDao;
	


	@Override
	public void insert(EmployeeDto employeeDto) {
		try {
			Employee employee = new ModelMapper().map(employeeDto, Employee.class);
			//employee.setEmployeeUuid(employee.getEmployeeName().trim().concat("" + Math.random()));
			employee.setEmployeeUuid(UuidUtil.getUuid(employee.getEmployeeName()));
			employee.getAddress().setAddressUuid(UuidUtil.getUuid());

			employeeDao.saveEmployee(employee);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(String employeeUuid) {
	
		employeeDao.deleteemp(employeeUuid);
		
	}

	@Override
	public EmployeeDto getEmployeeData(String employeeUuid) {
		return employeeDao.getEmployeeData(employeeUuid);
		

		
	}


	@Override
	public List<EmployeeDto> getEmployeeAllData() {
		return employeeDao.getEmployeeAllData();
	}

	@Override
	public void updateEmployeeData(EmployeeDto employeeDto) {
		
		employeeDao.updateEmployeeData(employeeDto);
	}





	


}
