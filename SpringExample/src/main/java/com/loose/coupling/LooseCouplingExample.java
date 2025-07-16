package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoClooseCouplingExample.xml");

        UserManager userManagerWithDB =(UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWithWS =(UserManager) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWS.getUserInfo());

        UserManager userManagerWithNewDB = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
