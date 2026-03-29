package com.manikanta.firstspringwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

//    @GetMapping("/welcome")
//    public ModelAndView displaySomeResponce1(){
//        ModelAndView mav=new ModelAndView();
//        mav.addObject("message","Hello! Welcome to our first web App1");
//        mav.setViewName("index");
//
//        return mav;
//
//    }
    @GetMapping("/welcome")
    public String displaySomeResponce1(Model model){
        System.out.println("Model internally implemented by "+model.getClass().getName());
        model.addAttribute("info","We have Fast tract Spring boot batch next weekend");
        return "index";
    }

    @GetMapping("/welcome2")
    public String displaySomeResponce2(Model model){
        model.addAttribute("info","We have Fast tracked DevOps with AWS course ");
        return "index";

    }
//    @GetMapping("/skill")
//    public String displaySomeMsg(Model model){
//        model.addAttribute("focus","Focus is the most Important skill ");
//        return "focus";
//
//    }
    @GetMapping("/info")
    public String displaySomeMsg(Model model){
        model.addAttribute("info","Focus is the most Important skill ");
        return "telusko";

    }
}
