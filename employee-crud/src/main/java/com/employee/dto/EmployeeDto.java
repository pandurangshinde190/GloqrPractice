package com.employee.dto;

import com.employee.entity.Address;

public class EmployeeDto {

	private AddressDto address;
	private String employeeUuid;
	private String designation;
	private double salary;
	private int experience;
	private String department;

	private String employeeName;


	public AddressDto getAddress() {
		return address;
	}
	public void setAddress(AddressDto address) {
		this.address = address;
	}
	public String getEmployeeUuid() {
		return employeeUuid;
	}
	public void setEmployeeUuid(String employeeUuid) {
		this.employeeUuid = employeeUuid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	

}
