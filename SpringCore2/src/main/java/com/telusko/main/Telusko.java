package com.telusko.main;


import com.telusko.services.ICourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Telusko {


//    @Autowired
//    @Qualifier("java")
    private ICourse course;

    //constructor injection
    @Autowired
    public Telusko(@Qualifier("java") ICourse course){
        System.out.println("Telusko bean created");
        this.course=course;
    }

    public Telusko(){
        System.out.println("Telusko bean created");
    }

    public void setCourse(ICourse course){
        System.out.println("Setter Injection");
        this.course=course;
    }

    public Boolean buyTheCourse(Double amount){
        return course.getTheCourse((amount));
    }

}
