package ObjectLevelLocking;

import ObjectLevelLocking.HSBC;

public class Atm extends Thread{

  private HSBC bank;

  public Atm(HSBC bank){
    this.bank=bank;
  }

  @Override
  public void run(){
    System.out.println("Withdrawal");
    bank.withdrawal(400);
  }
  
}
