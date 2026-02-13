package com.manikanta;

import com.manikanta.dao.EmployeeDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container=SpringApplication.run(SpringBootDataJpaApplication.class, args);
        EmployeeDao dao=container.getBean(EmployeeDao.class);
        dao.input();
    }

}
