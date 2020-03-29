package com.example.api.controller;

import com.example.api.Student;
import com.example.api.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/students")
@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/")
    public List<Student> findAll(){
        return studentDao.findAll();
    }

    @PostMapping("/")
    public Student add(@ModelAttribute Student student){
        studentDao.addStudent(student);
        return student;
    }

}
