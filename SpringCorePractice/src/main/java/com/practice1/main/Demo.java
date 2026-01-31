package com.practice1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
        Student student1=container.getBean(Student.class);
        student1.getTeaher();
    }
}
