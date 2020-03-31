package com.example.api;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao{

    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("Adam","Kowalski"));
        studentList.add(new Student("Piotr","Nowak"));
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public Student getStudentById(int id) {
        return studentList.get(id);
    }

    @Override
    public Student deleteStudentById(int id) {
        return studentList.remove(id);
    }


}
