package com.tutorial.restapi_tutorial.controller;

import com.tutorial.restapi_tutorial.dto.StudentDto;
import com.tutorial.restapi_tutorial.entity.Student;
import com.tutorial.restapi_tutorial.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }



}
