package ObjectLevelLocking;

public class Demo {
  public static void main(String[] args) {
    HSBC bank1=new HSBC(4000);

    Atm atm=new Atm(bank1);
    atm.setName("ATM Thread");

    GooglePay gpay=new GooglePay(bank1);
    gpay.setName("GPAY Thread");

    PhonePay ppay=new PhonePay(bank1);
    ppay.setName("phonepe Thread");

    atm.start();
    gpay.start();
    ppay.start();
  }
  
}
