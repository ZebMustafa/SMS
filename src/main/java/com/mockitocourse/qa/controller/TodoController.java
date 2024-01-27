package com.mockitocourse.qa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mockitocourse.qa.service.TodoServiceStub;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
public class TodoController {
	
	private TodoServiceStub todoServiceImpl;

	@GetMapping("/get/todo/{id}")
	public ResponseEntity<List<String>> retrieveTodosRelatedToSpring(@PathVariable String id) {
		
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoServiceImpl.retrieveTodos(id);
		for (String todo : allTodos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return new ResponseEntity<>(allTodos, HttpStatus.OK);
	}
//
//	public void deleteTodosNotRelatedToSpring(String user) {
//		List<String> allTodos = todoService.retrieveTodos(user);
//		for (String todo : allTodos) {
//			if (!todo.contains("Spring")) {
//				todoService.deleteTodo(todo);
//			}
//		}
//	}

}
