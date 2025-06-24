package com.firstproject.firstwebapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

  @GetMapping("/")
  public String greet(){
    return "<h1>Welcome my application</h1>";
  }

  
}
