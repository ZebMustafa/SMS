package com.mockitocourse.qa.repository;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.mockitocourse.qa.entity.Gender;
import com.mockitocourse.qa.entity.Student;

@DataJpaTest
class StudentRepositoryTest {
	
	@Autowired
	private StudentRepository underTest;
	
	@AfterEach
	void tearDown() {
		underTest.deleteAll();
	}

	@Test
	void isSelectExistEmailTest() {
		// given
		String email = "zebmustafa@gmail.com";
		
		Student student = new Student("Zeb",
				email,
				Gender.MALE);
		underTest.save(student);
		
		// when
		boolean exist = underTest.selectExistEmail(email);
		
		// then
		assertTrue(exist);
	}
	
	
	@Test
	void isSelectEmailNotExistTest() {
		// given
		String email = "zebmustafa@gmail.com";
		
		// when
		boolean exist = underTest.selectExistEmail(email);
		
		// then
		assertFalse(exist);
	}

}
