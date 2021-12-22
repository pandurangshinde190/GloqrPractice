package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.models.User;

public interface UserRepository extends JpaRepository<User, String>{

	User findByUsername(String username);

}
