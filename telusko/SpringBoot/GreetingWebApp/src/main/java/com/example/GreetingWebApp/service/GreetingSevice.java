package com.example.GreetingWebApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.*;

@Service
public class GreetingSevice implements IGreetings{

    @Autowired
    private LocalTime time;

    @Override
    public String generateWish(String name) {
        int hour=time.getHour();
        System.out.println(hour);
        if(hour<12){
            return "Good Morning "+name;
        }else if(hour<16){
            return "Good Afternoon "+name;
        }
        else if(hour<20){
            return "Good Evening "+name;
        }else
        {
            return "Good Night "+name;
        }
    }
}
