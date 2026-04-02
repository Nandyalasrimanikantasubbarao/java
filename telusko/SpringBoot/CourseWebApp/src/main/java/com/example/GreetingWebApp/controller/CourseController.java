package com.example.GreetingWebApp.controller;


import com.example.GreetingWebApp.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

    @GetMapping("/courseinfo")
    public String getCourseInfo(Model model){
        model.addAttribute("cid","Telusko1");
        model.addAttribute("cname","DevOps");
        model.addAttribute("price","4999");
        return "course";
    }

    @GetMapping("/coursedetails")
    public String getCourseDetails(Model model){
        Course course=new Course();
        course.setCid(1);
        course.setCname("DevOps with aws");
        course.setPrice(5999.9);
        model.addAttribute("course",course);

        return "courseinfo";
    }
}
