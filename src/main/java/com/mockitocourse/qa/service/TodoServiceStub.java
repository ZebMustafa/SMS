package com.mockitocourse.qa.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoServiceStub implements TodoService{
	

	@Override
	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC","Learn Microservice in Spring","Learn Django");
	}

	@Override
	public void deleteTodo(String todo) {
		
	}
	

}
