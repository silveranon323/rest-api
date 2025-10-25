package com.tutorial.restapi_tutorial.service.impl;

import com.sun.jdi.PrimitiveValue;
import com.tutorial.restapi_tutorial.dto.StudentDto;
import com.tutorial.restapi_tutorial.entity.Student;
import com.tutorial.restapi_tutorial.repository.StudentRepository;
import com.tutorial.restapi_tutorial.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtoList = students.stream()
                .map(student -> new StudentDto(student.getId(),student.getName(),student.getEmail()))
                .toList();
        return studentDtoList;
    }
}
