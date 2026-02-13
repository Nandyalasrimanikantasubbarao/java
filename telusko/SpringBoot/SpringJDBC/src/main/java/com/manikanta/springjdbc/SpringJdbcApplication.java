package com.manikanta;

import com.manikanta.dao.EmployeeDaoImp1;
import com.manikanta.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container=SpringApplication.run(SpringJdbcApplication.class, args);
        EmployeeDaoImp1 dao=container.getBean(EmployeeDaoImp1.class);

//        List<Employee> list=dao.getEmployeeInfo();
//
//
//        list.forEach(e-> System.out.println(e));

        dao.getEmployeeInfo().forEach(e-> System.out.println(e));

    }
}
