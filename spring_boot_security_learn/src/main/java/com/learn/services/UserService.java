package com.learn.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.models.User;

@Service
public class UserService {

	List<User> list=new ArrayList<>();

	public UserService() {
		list.add(new User("abc","abc","ABC@gmail.com"));
		list.add(new User("def","def","DEF@gmail.com"));
		list.add(new User("ghi","ghi","GHI@gmail.com"));
	}
	
	//get all user
	public List<User> getAllUser()
	{
		return this.list;
	}
	
	//get single user
	public User getUser(String username)
	{
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
		
	}
	
	
	//add user
	public User addUser(User user)
	{
		this.list.add(user);
		return user;
		
	}
	
}
