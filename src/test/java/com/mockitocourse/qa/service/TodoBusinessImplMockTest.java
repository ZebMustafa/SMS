package com.mockitocourse.qa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.mockitocourse.qa.service.TodoBusinessImpl;
import com.mockitocourse.qa.service.TodoService;

class TodoBusinessImplMockTest {
	// What is Mocking
	// Mockito is the class which give a mock object of that class;

	@Test
	public void testRetrieveTodosRelatedToSpring() {
		TodoService todoServiceMock = mock(TodoService.class);
		
		List<String> list = Arrays.asList();
		
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(list);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		
		List<String> result = todoBusinessImpl.retrieveTodosRelatedToSpring("summy");
		assertEquals(0, result.size());
	}
	
	@Test
	public void testListSizeSingleValue() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(2);
		
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void testListSizeSingleMultipleValues() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(2).thenReturn(3).thenReturn(4);
		
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
		assertEquals(4, listMock.size());
	}
	
	
	@Test
	public void testListInternalValues() {
		List listMock = mock(List.class);
		
		when(listMock.get(anyInt())).thenReturn("myValue");
		
		assertEquals("myValue", listMock.get(0));
		assertEquals("myValue", listMock.get(1));
		
		// Argument Matcher comes , such AnyInt()
	}
	
	// Argument Matcher comes , such AnyInt(), AnyString, Any...
	@Test
	@Disabled("for demonstration purposes")
	public void testListInternalValuesThrowException() {
		List listMock = mock(List.class); 
	
		Assertions.assertThrows(RuntimeException.class, new Executable() {
			@Override
			public void execute(){
				when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something wrong happen."));
			}
		});
		
	}
	
	@Test
    void testOnlyOnDeveloperWorkstation() {
		
        assumeTrue("DEV".equals(System.getenv("ENV")),
            () -> "Aborting test: not on developer workstation");
    }

}
