package com.manikanta;

import com.manikanta.services.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //==>@ComponentScan +@ AutoConfiguration
public class DemoTestApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext container=SpringApplication.run(DemoTestApplication.class, args);
        Alien al=container.getBean(Alien.class);
        al.display();
        container.close();
    }

}

