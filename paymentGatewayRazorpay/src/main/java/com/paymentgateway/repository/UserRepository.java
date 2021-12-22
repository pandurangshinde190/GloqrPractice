package com.paymentgateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentgateway.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
