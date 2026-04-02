package com.example.GreetingWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PathController {

//    @GetMapping("/getinfo")
//    public String getSomeInfo(String name,Model model){
//        String info="Hello "+name+ " I hope your learning from this course";
//        model.addAttribute("msg",info);
//        return "home";
//    }

    @GetMapping("/getinfo/{name}/{course}")
    public String getSomeInfo(@PathVariable("name") String n,@PathVariable("course") String c, Model model){
        String info="Hello "+n+ " I hope your learning from this "+c;
        model.addAttribute("msg",info);
        return "home";
    }
}
