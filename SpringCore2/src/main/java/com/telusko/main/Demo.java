package com.telusko.main;

import com.telusko.services.Java;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

//        beanFactory
//        application context

        ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
        Java t=container.getBean(Java.class);
        t.getTheCourse(4040.40);

    }
}
