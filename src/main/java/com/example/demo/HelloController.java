package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/student")
    public Student getStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("kevin");
        return student;
    }

}
