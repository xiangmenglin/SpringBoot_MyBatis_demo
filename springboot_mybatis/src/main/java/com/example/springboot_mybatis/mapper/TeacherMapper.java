package com.example.springboot_mybatis.mapper;

import com.example.springboot_mybatis.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {

    Teacher findByName(String name);

    List<Teacher> findAll();
}
