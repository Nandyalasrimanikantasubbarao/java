package com.manikanta;

import com.manikanta.dto.CustomerDTO;
import com.manikanta.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataMongoDbApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext continer=SpringApplication.run(SpringDataMongoDbApplication.class, args);
        CustomerService service=continer.getBean(CustomerService.class);

//        service.registerCustomer(new CustomerDTO(4,"Abhi","Mumbai"));
//
        service.findALlCustomer().forEach(v-> System.out.println(v));

//        service.removeDoecument("69c245a93aab2841604eeb86");

    }

}
