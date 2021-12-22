package com.spring.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.demo.model.Todo;
import com.spring.demo.model.TodoStatus;
import com.spring.demo.repositories.TodoRepository;

@Component
public class TodoLoader implements CommandLineRunner{

	@Autowired
	public final TodoRepository todoRepository;

	    public TodoLoader(TodoRepository todoRepository) {
	        this.todoRepository = todoRepository;
	    }
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
    private void loadTodos() {
        if (todoRepository.count() == 0) {
            todoRepository.save(
                    Todo.builder()
                            .title("Go to market")
                            .description("Buy eggs from market")
                            .todoStatus(TodoStatus.NOT_COMPLETED)
                            .build()
            );
            todoRepository.save(
                    Todo.builder()
                            .title("Go to school")
                            .description("Complete assignments")
                            .todoStatus(TodoStatus.NOT_COMPLETED)
                            .build()
            );
            System.out.println("Sample Todos Loaded");
        }
    }
}
