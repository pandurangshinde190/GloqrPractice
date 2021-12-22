package com.spring.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.model.Todo;
import com.spring.demo.repositories.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
    TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
	
    	//Insert Data
	  @Override
	    public Todo insert(Todo todo) {
	        return todoRepository.save(todo);
	    }
	  
//	  //get the all data
	    public List<Todo> getTodos() {
	        List<Todo> todos = new ArrayList<>();
	        todoRepository.findAll().forEach(todos::add);
	        return todos;
	    }
	    
	    
	    //get the perticular id
	    @Override
	    public Todo getTodoById(Long id) {
	        return todoRepository.findById(id).get();
	    }

	    
	    //delete the data
	    @Override
	    public void deleteTodo(Long todoId) {
	        todoRepository.deleteById(todoId);
	    }
	    
	    
	    
	    //update the data
	    @Override
	    public void updateTodo(Long id, Todo todo) {
	        Todo todoFromDb = todoRepository.findById(id).get();
	        System.out.println(todoFromDb.toString());
	        todoFromDb.setTodoStatus(todo.getTodoStatus());
	        todoFromDb.setDescription(todo.getDescription());
	        todoFromDb.setTitle(todo.getTitle());
	        todoRepository.save(todoFromDb);
	    }
}
