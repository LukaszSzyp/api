package com.example.api;

import java.util.List;

public interface StudentDao {

    void addStudent (Student student);
    List<Student> findAll();
    Student getStudentById (int id);

    Student deleteStudentById(int id);

    void updateStudent(Student student);
}
