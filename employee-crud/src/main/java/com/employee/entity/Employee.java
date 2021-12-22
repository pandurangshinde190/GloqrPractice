package com.employee.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.apache.lucene.analysis.core.LowerCaseFilterFactory;
import org.apache.lucene.analysis.ngram.EdgeNGramFilterFactory;
import org.apache.lucene.analysis.snowball.SnowballPorterFilterFactory;
import org.apache.lucene.analysis.standard.StandardTokenizerFactory;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.AnalyzerDef;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Parameter;
import org.hibernate.search.annotations.Store;
import org.hibernate.search.annotations.TokenFilterDef;
import org.hibernate.search.annotations.TokenizerDef;


@Entity
@Indexed
@AnalyzerDef(name = "customanalyzer", tokenizer = @TokenizerDef(factory = StandardTokenizerFactory.class), filters = {
		@TokenFilterDef(factory = LowerCaseFilterFactory.class),
		@TokenFilterDef(factory = SnowballPorterFilterFactory.class, params = {
				@Parameter(name = "language", value = "English"), }), })
@AnalyzerDef(name = "nGramAnalyzer", tokenizer = @TokenizerDef(factory = StandardTokenizerFactory.class), filters = {
		@TokenFilterDef(factory = LowerCaseFilterFactory.class),
		@TokenFilterDef(factory = SnowballPorterFilterFactory.class, params = {
				@Parameter(name = "language", value = "English"), }),
		@TokenFilterDef(factory = EdgeNGramFilterFactory.class, params = {
				@Parameter(name = "maxGramSize", value = "25"), @Parameter(name = "minGramSize", value = "2") }) })
public class Employee implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@DocumentId
	private Long id;
	
	@Column(name = "employee_uuid", unique = true, nullable = false, updatable = false)
	private String employeeUuid;
	
	@Column(name = "employee_name")
	@Field(analyze = Analyze.YES)
	@Analyzer(definition = "nGramAnalyzer")
	private String employeeName;
	
	@OneToOne(cascade =CascadeType.ALL )
	private Address address;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "salary")
	private double salary;
	
	@Column(name = "experience")
	private int experience;
	
	@Column(name = "department")
	private String department;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeUuid() {
		return employeeUuid;
	}

	public void setEmployeeUuid(String employeeUuid) {
		this.employeeUuid = employeeUuid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeUuid=" + employeeUuid + ", address=" + address + ", designation="
				+ designation + ", salary=" + salary + ", experience=" + experience + ", department=" + department
				+ "]";
	}



}
