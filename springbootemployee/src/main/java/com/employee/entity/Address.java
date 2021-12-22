package com.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Embeddable
@Entity
public class Address
 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long adderessId;
	private String street;
	private String city;
	private String district;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(long adderessId, String street, String city, String district, String state) {
		super();
		this.adderessId = adderessId;
		this.street = street;
		this.city = city;
		this.district = district;
		this.state = state;
	}
	public long getAdderessId() {
		return adderessId;
	}
	public void setAdderessId(long adderessId) {
		this.adderessId = adderessId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Adderess [adderessId=" + adderessId + ", street=" + street + ", city=" + city + ", district=" + district
				+ ", state=" + state + "]";
	}
	



}
