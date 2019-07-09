package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.dao.StudentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentDao studentDao;

    @Resource
    private StudentRepository studentRepository;

    @Override
    public void save(Student student){
        studentRepository.save(student);
    }

    @Override
    public Student getById(long id){
        return studentDao.getById(id);
    }

}
