package com.example.springboot_mybatis.service;

import com.example.springboot_mybatis.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TeacherService {
    public Teacher findByName(String name);

    public List<Teacher> findAll();
}
