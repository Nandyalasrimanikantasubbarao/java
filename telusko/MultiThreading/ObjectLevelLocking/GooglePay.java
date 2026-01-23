package ObjectLevelLocking;

import ObjectLevelLocking.HSBC;

public class GooglePay extends Thread{
  
  private HSBC bank;

  public GooglePay(HSBC bank){
    this.bank=bank;
  }

  @Override
  public void run(){
    System.out.println("deposit");
    bank.deposit(3000);
  }
}
