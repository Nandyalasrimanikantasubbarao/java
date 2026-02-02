package com.manikanta.demotest;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    public Dev(){
        System.out.println("Dev object is created");
    }
    public void build(){
        System.out.println("Building awesome project");
    }
}
