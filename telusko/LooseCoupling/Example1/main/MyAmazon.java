// import service.FedEx;
package main;

import Services.Delivary;
import main.Amazon;

public class MyAmazon {

  private Delivary service;

  public MyAmazon(Delivary service){
    this.service=service;
  }

  public MyAmazon(){

  }

  public void setService(Delivary service) {
    this.service = service;
  }

  public Boolean delivarProduct(Double amount){
    //tightly coupled
    // FedEx fed =new FedEx();



    return service.delivarProduct(amount);

    // Boolean val=fed.delivarProduct(amount);
    // return val;
    
  }
  
}
