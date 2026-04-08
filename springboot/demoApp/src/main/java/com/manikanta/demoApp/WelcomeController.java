package com.manikanta.demoApp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class WelcomeController {
  
  @GetMapping("/")
  public String welcome(){
    System.out.println("hi");
    return "<h1>welcome string boot</h1>";
  }

  @GetMapping("/product")
  public String product(){
    return "product1";
  }

  
}
