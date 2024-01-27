package com.mockitocourse.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mockitocourse.qa.entity.Student;
import com.mockitocourse.qa.repository.StudentRepository;


@RestController
@RequestMapping("student/v1")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;

	 @GetMapping("/all")
	  public @ResponseBody Iterable<Student> getAllStudents() {
	    // This returns a JSON or XML with the users
	    return studentRepository.findAll();
	  }
}
