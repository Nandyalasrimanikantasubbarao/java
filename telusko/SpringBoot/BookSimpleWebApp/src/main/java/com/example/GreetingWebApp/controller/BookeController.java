package com.example.GreetingWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookeController {

    @GetMapping("/home")
    public String ShowHomePage(){
        return "home";
    }

    @GetMapping("/response")
    public String getBooksInfo(Model model){
        String booksName[]=new String[]{"Java","Spring Boot","Hibernate"};
//        for(String book:booksName){
//            model.addAttribute("data",book);
//        }
            model.addAttribute("data",booksName);
        return "response";
    }
}
