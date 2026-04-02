package com.example.GreetingWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController {

//    @GetMapping("/getinfo")
//    public String getSomeInfo(String name,Model model){
//        String info="Hello "+name+ " I hope your learning from this course";
//        model.addAttribute("msg",info);
//        return "home";
//    }

    @GetMapping("/getinfo")
    public String getSomeInfo(@RequestParam("name") String n, Model model){
        String info="Hello "+n+ " I hope your learning from this course";
        model.addAttribute("msg",info);
        return "home";
    }
}
