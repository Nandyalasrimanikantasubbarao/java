package com.firstapp.firstapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class First {
  @GetMapping("/")
  public String getMethodName() {
      return "<h1>hi</h1>";
  }
}
