package com.example.demo.dao;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class StudentDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Student getById(long id){
        String sql = "select * from Student where id=?";
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<>(Student.class);

        return (Student)jdbcTemplate.queryForObject(sql, rowMapper, id);
    }
}
