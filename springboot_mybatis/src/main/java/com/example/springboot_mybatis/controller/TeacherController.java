package com.example.springboot_mybatis.controller;

import com.example.springboot_mybatis.entity.Teacher;
import com.example.springboot_mybatis.service.TeacherService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/msg")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/getMsg")
    public String getMsg(@Param("name") String name){
        Teacher teacher = teacherService.findByName(name);
        return teacher.toString();
    }

    @GetMapping("/getAll")
    public String getAll(){
        List<Teacher> teacherList = teacherService.findAll();
        return teacherList.toString();
    }

    @GetMapping("/")
    public String Hello(){
        return "Hello World!";
    }
}
