package com.tutorial.restapi_tutorial.controller;

import com.tutorial.restapi_tutorial.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(1L,"Hem Kishore Pradhan","hemkishore009jsr@gmail.com");
    }



}
