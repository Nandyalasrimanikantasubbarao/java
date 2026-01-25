package Main;

import Main.Services.ICourse;
import Main.Services.Java;
import Main.Services.SpringBoot;
import Main.Services.Telusko;

class Alpha{
  public void alpha(){

  }
}

class Beta //extends Alpha
{
  public void beta(){
//  !   composition Beta and Alpha tightly coupled
//    Alpha a=new Alpha();
//    a.alpha();
//    alpha()
    
  }
}
public class Demo {
  public static void main(String[] args) {
//    System.out.println("Hi");

//    constructor injection
    Telusko t=new Telusko(new Java());//Target class

    t.setCourse(new SpringBoot());//dependency injecting

    Boolean status=t.buyTheCourse(4545.5);
    if(status){
      System.out.println("course enrolled Successfully");
    }else{
      System.out.println("Failed to enroll for the course");
    }
  }
}
