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

//       service.fetchByVaccineCompany("BharatBio").forEach(e-> System.out.println(e));
//       service.fetchByVaccineCompany("BharatBio","WHO").forEach(e-> System.out.println(e));

//        service.fetchVaccineByCost(4500.00,5100.99).forEach(v-> System.out.println(v));

//        int rowsEffected=service.updateThePriceByVaccineName(2500.00,"Covaxin");
//        if(rowsEffected!=0){
//            System.out.println("Update Success");
//        }else{
//            System.out.println("Update failed");
//        }

//        int rowsEffected=service.deleteTheVaccinesByPriceRange(2000.00,2600.00);
//        if(rowsEffected!=0){
//            System.out.println("Record deleted successfully");
//        }else{
//            System.out.println("Record deleted failed");
//        }

//        int rowsEffected=service.insertVaccineDetails(121,"Covaxin","BhartBio",4545.45);
//        if(rowsEffected!=0){
//            System.out.println("New Record Added");
//        }else{
//            System.out.println("Failed to add new Record");
//        }

        System.out.println(service.getSystemDateAndTime());


    }
}
