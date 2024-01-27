package com.mockitocourse.qa.service;

import com.mockitocourse.qa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    @Autowired
    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
/*
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        Boolean existsEmail = studentRepository
                .selectExistEmail(student.getEmail());
        if (existsEmail) {
            try {
                throw new BadRequestException(
                        "Email " + student.getEmail() + " taken");
            } catch (BadRequestException e) {
                throw new RuntimeException(e);
            }
        }

        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) throws StudentNotFoundException {
        if(!studentRepository.existsById(studentId)) {
            throw new StudentNotFoundException(
                    "Student with id " + studentId + " does not exists");
        }
        studentRepository.deleteById(studentId);
    }
*/

}
