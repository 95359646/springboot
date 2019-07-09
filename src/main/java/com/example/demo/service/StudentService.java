package com.example.demo.service;

import com.example.demo.model.Student;

public interface StudentService {
    void save(Student student);
    Student getById(long id);
}
