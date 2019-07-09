package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private StudentService studentService;

    @Autowired
    public HelloController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping("/student")
    public Student getStudent(){
        Student Student = new Student();
        Student.setId(1);
        Student.setName("kevin-updated4");
        return Student;
    }

    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }

    @RequestMapping("/getById")
    public Student getById(long id){
        return studentService.getById(id);
    }

}
