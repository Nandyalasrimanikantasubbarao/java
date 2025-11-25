package main;

import main.Telusko;
import Services.*;

public class Application {
  public static void main(String[] args) {
    Telusko t=new Telusko();

    t.setCources(new DevOps());
    t.setCources(new SpringBootCorce());
    
    Boolean status=t.buyTheCource(2500d);

    if(status)
      System.out.println("Course purchased Sucessfully");
    else
      System.out.println("Failed to buy the course");
  }
}
