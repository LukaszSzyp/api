package com.example.api.controller;

import com.example.api.Student;
import com.example.api.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RequestMapping("/api/students")
@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/")
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @PostMapping("/")
    public Student add(@ModelAttribute Student student) {
        studentDao.addStudent(student);
        return student;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentDao.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public Student deleteStudentById(@PathVariable("id") int id) {
        return studentDao.deleteStudentById(id);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteStudentById(@RequestBody Student student) {
        studentDao.updateStudent(student);
    }
}

