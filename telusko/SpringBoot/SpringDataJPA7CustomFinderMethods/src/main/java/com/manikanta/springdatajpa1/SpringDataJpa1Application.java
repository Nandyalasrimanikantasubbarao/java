package com.manikanta;

import com.manikanta.entity.Vaccine;
import com.manikanta.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.*;

@SpringBootApplication
public class SpringDataJpa1Application {

    public static void main(String[] args) {
       ConfigurableApplicationContext container= SpringApplication.run(SpringDataJpa1Application.class, args);
       VaccineService service=container.getBean(VaccineService.class);

//       service.fetchByCost(4100.4).forEach(v-> System.out.println(v));

//       service.fetchByCostLessThanEqual(5000.9).forEach(e-> System.out.println(e));

//        service.fetchByCostBetween(4500.00,5000.00).forEach(e-> System.out.println(e));
        service.fetchByVaccineCompanyEquals("BharatBio").forEach(e-> {
            System.out.println(e);
        });




    }
}
