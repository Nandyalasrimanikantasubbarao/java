package com.manikanta;

import com.manikanta.entity.Vaccine;
import com.manikanta.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpa1Application {

    public static void main(String[] args) {
       ConfigurableApplicationContext container= SpringApplication.run(SpringDataJpa1Application.class, args);
       VaccineService service=container.getBean(VaccineService.class);

//       String status=service.registerVaccineInfo(new Vaccine("Polio","WHO",4500.4));

//       Vaccine vac1=new Vaccine("Polio","WHO",4500.4);
//       Vaccine vac2=new Vaccine("CovidShield","Astrazenica",4100.4);
//       Vaccine vac3=new Vaccine("Covaxin","BharatBio",4300.4);

//
//       List<Vaccine> vaccines=new ArrayList<>();
//       vaccines.add(new Vaccine("Polio","WHO",4500.4));
//       vaccines.add(new Vaccine("CovidShield","Astrazenica",4100.4));
//       vaccines.add(new Vaccine("Covaxin","BharatBio",4300.4));
//
//       service.registerMultipleVaccineInfo(vaccines).forEach(val->System.out.println(val));
//       System.out.println(status);
        Long count=service.vaccinecount();
        System.out.println("Number of vaccine available"+count);
        int id=2;
        Boolean avaible=service.checkVaccineAvailability(id);
        if(avaible){
            System.out.println("Vaccine with id"+id+"is available");
        }else {
            System.out.println("Vaccine with id"+id+"not available");
        }

        service.getAllVaccine().forEach(val->System.out.println(val));
    }

}
