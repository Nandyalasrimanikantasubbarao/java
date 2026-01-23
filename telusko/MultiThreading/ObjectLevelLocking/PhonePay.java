package ObjectLevelLocking;

import ObjectLevelLocking.HSBC;

public class PhonePay extends Thread{
  private HSBC bank;

  public PhonePay(HSBC bank){
    this.bank=bank;
  }

  @Override
  public void run(){
    System.out.println("balance checking");
    bank.checkBalance();
  }
  
}
