package com.pdf.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import com.pdf.entity.User;
import com.pdf.repository.UserRepository;

@Service
@Transactional
public class UserServices {
    @Autowired
    private UserRepository userRepository;
     
    public List<User> listAll() {
        return userRepository.findAll(Sort.by("email").ascending());
    }

	public void save(User user) {
		userRepository.save(user);
		
	}
}
