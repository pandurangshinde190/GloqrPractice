package com.user.dto;

import java.util.List;

import com.user.entity.Education;

public class UserDto {
	private String username;
	private String password;
	private Long age;
	private String adderess;

	private List<Education> education;

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(String username, String password, Long age, String adderess, List<Education> education) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.adderess = adderess;
		this.education = education;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getAdderess() {
		return adderess;
	}

	public void setAdderess(String adderess) {
		this.adderess = adderess;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "UserDto [username=" + username + ", password=" + password + ", age=" + age + ", adderess=" + adderess
				+ ", education=" + education + "]";
	}

}
