package com.telusko.main;

import com.telusko.service.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

//        beanFactory
//        application context

        ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
        Employee emp1=container.getBean(Employee.class);
//        emp1.employeeTask();
        System.out.println(emp1.employeeTask());

    }
}
