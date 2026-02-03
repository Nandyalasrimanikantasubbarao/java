package com.manikanta.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    static {
        System.out.println("Static block of alien Bean");
    }

    {
        System.out.println("Java Instance of ALien Bean");
    }


    public Alien(){
        System.out.println("Alien Bean Created");
    }

    @PostConstruct
    public void init(){
        System.out.println("Init method of Alien");
    }

    public void display(){
        System.out.println("Business logic of Alien class");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean Destroyed");
    }
}
