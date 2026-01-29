package com.telusko.service;

import org.springframework.stereotype.Component;

@Component("aliean") //create component with new bean id
public class Alian {
    public Alian(){
        System.out.println("Alien package is created");
    }
}
