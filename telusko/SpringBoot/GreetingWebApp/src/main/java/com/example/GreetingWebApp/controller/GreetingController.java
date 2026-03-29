package com.example.GreetingWebApp.controller;

import com.example.GreetingWebApp.service.IGreetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @Autowired
    private IGreetings greetService;

    @GetMapping("/greeting")
    public String generateWish(Model model){
        String greetings=greetService.generateWish("Manikanta");
        model.addAttribute("wish",greetings);
//        model.addAttribute("wish",greetings);
        return "greeting";
    }
}
