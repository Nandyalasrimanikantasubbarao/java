package com.manikanta.firstspringwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @RequestMapping(value="/welcome",method = RequestMethod.GET)
    public ModelAndView displaySomeResponce(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("message","Hello! Welcome to our first web App");
        mav.setViewName("index");

        return mav;

    }

    @GetMapping("/")
    public ModelAndView displaySomeResponce1(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("message","Hello! Welcome to our first web App1");
        mav.setViewName("index");

        return mav;

    }
}
