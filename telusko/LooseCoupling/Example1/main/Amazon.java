package main;

import Services.FedEx;
import Services.FirstFlight;
import Services.Delivary;

public class Amazon {
  public static void main(String[] args) {

    //Injecting dependent object/dependency into target class is called as dependency injection
    //if this is done through constructor we call as constructor injection
    //if this is done through setter we call as setter injection

    //target class/object==> a class where services of other classes are being used
    //eg in this project==> MyAmazon class

    //dependency object/class ==>a class whose services will be used in target class
    //eg in this project ==>FirstFight , FedEx, Blue Dart

    //Constructor Injection
    MyAmazon amz=new MyAmazon(new FirstFlight());

    // FedEx fed=new FedEx();
    // amz.setService(fed);

    // or

    //setter Injection
    amz.setService(new FedEx());

    Boolean status=amz.delivarProduct(5262.8);

    if(status)
      System.out.println("Product Delivary sucessfull");
    else
      System.out.println("Failed to Delivar Product");
  }
  
}
