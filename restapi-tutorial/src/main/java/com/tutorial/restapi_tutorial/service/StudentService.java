package com.tutorial.restapi_tutorial.service;

import com.tutorial.restapi_tutorial.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    List<StudentDto> getAllStudents();
}
