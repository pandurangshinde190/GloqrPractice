package com.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eduId;
	private String Type;
	private String name;

	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Education(String type, String name) {
		super();
		Type = type;
		this.name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
