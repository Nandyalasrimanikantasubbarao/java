package com.manikanta;

import com.manikanta.entity.Vaccine;
import com.manikanta.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpa1Application {

    public static void main(String[] args) {
       ConfigurableApplicationContext container= SpringApplication.run(SpringDataJpa1Application.class, args);
       VaccineService service=container.getBean(VaccineService.class);

       service.fetchByCost(4400.50).forEach(v-> System.out.println(v.getVaccineName()+" "+v.getVaccineCompany()));


    }
}
