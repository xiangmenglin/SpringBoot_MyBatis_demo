package com.example.springboot_mybatis.entity;

public class Teacher {

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public Integer getTeacher_dept_id() {
        return teacher_dept_id;
    }

    public void setTeacher_dept_id(Integer teacher_dept_id) {
        this.teacher_dept_id = teacher_dept_id;
    }

    public String getTeacher_title() {
        return teacher_title;
    }

    public void setTeacher_title(String teacher_title) {
        this.teacher_title = teacher_title;
    }

    public String getTeacher_tel() {
        return teacher_tel;
    }

    public void setTeacher_tel(String teacher_tel) {
        this.teacher_tel = teacher_tel;
    }

    public String getTeacher_address() {
        return teacher_address;
    }

    public void setTeacher_address(String teacher_address) {
        this.teacher_address = teacher_address;
    }

    public String getTeacher_email() {
        return teacher_email;
    }

    public void setTeacher_email(String teacher_email) {
        this.teacher_email = teacher_email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id=" + teacher_id +
                ", teacher_name='" + teacher_name + '\'' +
                ", teacher_dept_id=" + teacher_dept_id +
                ", teacher_title='" + teacher_title + '\'' +
                ", teacher_tel='" + teacher_tel + '\'' +
                ", teacher_address='" + teacher_address + '\'' +
                ", teacher_email='" + teacher_email + '\'' +
                '}';
    }

    public Integer teacher_id;
    public String teacher_name;
    public Integer teacher_dept_id;
    public String teacher_title;
    public String teacher_tel;
    public String teacher_address;
    public String teacher_email;
}
