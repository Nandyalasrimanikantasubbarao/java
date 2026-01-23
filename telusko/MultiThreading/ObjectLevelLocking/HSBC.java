package ObjectLevelLocking;

public class HSBC {
 
  int accountBal;

  public HSBC(int accountBal){
    this.accountBal=accountBal;
  }

  synchronized public void withdrawal(int withdrawal){
    accountBal=accountBal-withdrawal;
  }

  synchronized public void deposit(int deposit){
    accountBal+=deposit;
  }

  synchronized public void checkBalance(){
    System.out.println("The Balance is the account is: "+accountBal);
  }
}
