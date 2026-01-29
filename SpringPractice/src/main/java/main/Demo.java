package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.HelloService;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
        HelloService h=container.getBean(HelloService.class);
        h.sayHello();
    }
}
