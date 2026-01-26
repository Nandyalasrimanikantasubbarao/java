package main;

import services.ICourse;

public class Telusko {
    private ICourse course;

    public Telusko(ICourse course){
        System.out.println("Telusko bean created");
        this.course=course;
    }

    public  Telusko(){
        System.out.println("Telusko bean created");
    }

    public void setCourse(ICourse course){
        this.course=course;
    }

    public Boolean buyTheCourse(Double amount){
        return course.getTheCourse((amount));
    }


}
