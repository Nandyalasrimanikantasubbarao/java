package com.manikanta;

import com.manikanta.services.GreetingService;
import com.manikanta.services.IGreetings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //==>@ComponentScan +@ AutoConfiguration
public class DemoTestApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext container=SpringApplication.run(DemoTestApplication.class, args);

        GreetingService greet=container.getBean(GreetingService.class);

        String status=greet.generateWish("Manikanta");
        System.out.println(status);
    }

}
