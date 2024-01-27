package com.mockitocourse.qa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.mockitocourse.qa.service.TodoBusinessImpl;
import com.mockitocourse.qa.service.TodoService;
import com.mockitocourse.qa.service.TodoServiceStub;

class TodoBusinessImplTest {


	@Test
	public void testRetrieveTodosRelatedToSpring() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		List<String> result = todoBusinessImpl.retrieveTodosRelatedToSpring("some user");
		assertEquals(2, result.size());
	}

}
