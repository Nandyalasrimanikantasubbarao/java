package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

//        beanFactory
//        application context

        ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");
//        Telusko t=container.getBean(Telusko.class);
//        Boolean status=t.buyTheCourse(4400.99);
    }
}
