package com.telusko.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class Java implements ICourse
{

    public Java(){
        System.out.println("Java Bean created");
    }

    @Override
    public Boolean getTheCourse(Double amount){
        System.out.println("Java Course purchased and the prices is "+amount);
        return true;
    }
}
