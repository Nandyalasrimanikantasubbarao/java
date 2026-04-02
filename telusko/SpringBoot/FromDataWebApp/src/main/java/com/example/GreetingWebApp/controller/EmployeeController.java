package com.example.GreetingWebApp.controller;

import com.example.GreetingWebApp.model.Employee;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController
{
    @GetMapping("/register")
    public String getHome(){
        return "register";
    }

    @PostMapping("/register")
    public String registr(Model model, Employee emp){
//        String name=req.getParameter("name");
        System.out.println(emp);
        model.addAttribute("emp",emp);
        return "response";
    }


}
