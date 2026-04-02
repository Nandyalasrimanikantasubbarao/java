package com.example.GreetingWebApp.controller;

import com.example.GreetingWebApp.service.IGreetings;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

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

    @GetMapping("/wish")
    public void generateWish(HttpServletResponse response) throws IOException {
        String greeting=greetService.generateWish("Manikanta");
        PrintWriter writer=response.getWriter();
        writer.println("<h1>Hello this response form controller directly</h1>");
    }
}
