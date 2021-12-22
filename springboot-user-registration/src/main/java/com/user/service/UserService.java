package com.user.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dto.UserDto;
import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void createUser(UserDto userd) {
		try {
			User user1 = new ModelMapper().map(userd, User.class);
			userRepository.save(user1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



}
