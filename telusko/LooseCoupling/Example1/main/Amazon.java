package main;

import Services.FedEx;
import Services.FirstFlight;
import Services.Delivary;

public class Amazon {
  public static void main(String[] args) {

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
