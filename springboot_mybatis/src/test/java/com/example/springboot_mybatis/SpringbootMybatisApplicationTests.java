package com.example.springboot_mybatis;

import com.example.springboot_mybatis.entity.Teacher;
import com.example.springboot_mybatis.mapper.TeacherMapper;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    @Rollback
    public void test() throws Exception{
        Teacher teacher = teacherMapper.findByName("张三");
        System.out.println(teacher.teacher_id);

    }


}
