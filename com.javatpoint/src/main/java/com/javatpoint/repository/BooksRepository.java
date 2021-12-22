package com.javatpoint.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.javatpoint.model.Books;

public interface BooksRepository extends JpaRepository<Books, Long>{
	

}
