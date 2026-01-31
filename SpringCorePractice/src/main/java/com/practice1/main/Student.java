package com.practice1.main;

import com.practice1.service.Teacher;

public class Student {
    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher=teacher;
    }

    public void getTeaher(){
        teacher.teach();
    }
}
