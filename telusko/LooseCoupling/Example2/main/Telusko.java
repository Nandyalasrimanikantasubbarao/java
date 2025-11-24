package main;

import Services.Icources;

public class Telusko {
  private Icources cource;

  public Telusko(Icources course){
    super();
    this.cource=course;
  }

  public Telusko(){
    super();
  }

  public void setCources(Icources cource){

    this.cource=cource;
  }

  public Boolean buyTheCource(Double amount){
    return cource.getTheCource(amount);
  }
  
}
