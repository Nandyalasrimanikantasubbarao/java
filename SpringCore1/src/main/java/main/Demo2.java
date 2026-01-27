package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {
    public static void main(String[] args) {

//        beanFactory
//        application context

        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("applicationconfig.xml");

//        Telusko t=beanFactory.getBean(Telusko.class);
//        Boolean status=t.buyTheCourse(4400.99);
//
//        if(status){
//            System.out.println("course purchased successfully");
//        }else{
//            System.out.println("Failed to buy the course");
//        }
    }
}
