package com.spring.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo , Long>{

}
