package com.spring.demo.services;

import java.util.List;

import com.spring.demo.model.Todo;

public interface TodoService {
	
	List<Todo> getTodos();
	
	Todo getTodoById(Long id);
	
	Todo insert(Todo todo);
	
	void deleteTodo(Long todoId);
	
	void updateTodo(Long id, Todo todo);
}
