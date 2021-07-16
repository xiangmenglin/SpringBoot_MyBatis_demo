package com.example.springboot_mybatis.service.impl;

import com.example.springboot_mybatis.entity.Teacher;
import com.example.springboot_mybatis.mapper.TeacherMapper;
import com.example.springboot_mybatis.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher findByName(String name) {
        return teacherMapper.findByName(name);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherMapper.findAll();
    }
}
