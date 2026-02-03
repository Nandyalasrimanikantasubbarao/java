package com.telusko;

import com.telusko.service.Amazon;
import com.telusko.service.FedX;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringBoot3Application.class, args);
		Amazon amazon= container.getBean(Amazon.class);
		Boolean status=amazon.deliverProduct(1000.90);

		if(status){
			System.out.println("Delivery success");
		}else{
			System.out.println("Failed to deliver");
		}
	}

}
