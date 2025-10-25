package com.tutorial.restapi_tutorial.controller;

import com.tutorial.restapi_tutorial.dto.StudentDto;
import com.tutorial.restapi_tutorial.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;



    @GetMapping("/students ")
    public List<StudentDto> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/student/{id}")
    public StudentDto getStudentById(@PathVariable Long id,@PathVariable String name){
        return studentService.getStudentById(id);
    }


}
