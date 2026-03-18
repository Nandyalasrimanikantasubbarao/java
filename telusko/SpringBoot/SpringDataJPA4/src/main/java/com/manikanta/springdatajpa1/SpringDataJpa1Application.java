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

//       Vaccine vaccine=service.searchVaccineById(3);
//        System.out.println(vaccine);

//        Vaccine vac=new Vaccine("Covaxin","BharatBio",454544.4);
//        vac.setId(54);
//        service.searchVaccineByGivenInfo(vac).forEach(v-> System.out.println(v));

        List<Integer> ids=new ArrayList<>();
        ids.add(152);
        ids.add(153);
        ids.add(154);
        String status=service.removeVaccineInfoByIds(ids);
        System.out.println(status);

    }
}
