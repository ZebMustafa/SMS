package com.mockitocourse.qa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoBusinessImpl {
	
	private TodoService todoServiceImpl;
	
	public TodoBusinessImpl(TodoService todoService){
		this.todoServiceImpl = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user) {
		
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoServiceImpl.retrieveTodos(user);
		for (String todo : allTodos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

}
