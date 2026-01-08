import java.util.*;

class Alpha extends Thread{

  @Override
  public void run(){
    banking();
  }

  public void banking(){
    System.out.println("Banking Activity Started");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the user number");
    int un=sc.nextInt();
    System.out.println("Enter the password");
    int pass=sc.nextInt();
    System.out.println("Collect your cash");
    System.out.println("Banking Activity terminated");
  }
}

class Beta1 extends Thread{
  @Override
  public void run(){
    try{

      printingStars();
    }catch(InterruptedException e){
      e.printStackTrace();
    }
  }

  public void printingStars() throws InterruptedException{
    System.out.println("Printing activity started");
    for(int i=0;i<=4;i++){
      System.out.println("focus is the key to master any skills");
      Thread.sleep(4000);

    }

    System.out.println("Printing important message terminated...");
  }
}

class Gamma1 extends Thread
{
  @Override
  public void run(){
    try{

      focus();
    }catch(InterruptedException e){
      e.printStackTrace();
    }
  }

  public void focus() throws InterruptedException{
    System.out.println("Printing activity started");
    for(int i=0;i<=4;i++){
      System.out.println("focus is the key to master any skills");
      Thread.sleep(4000);

    }

    System.out.println("Printing important message terminated...");
  }
}

public class Demo {
  public static void main(String[] args) throws InterruptedException{
    System.out.println("Apllication started");

    Alpha a=new Alpha();
    Beta1 b=new Beta1();
    Gamma1 g=new Gamma1();

    a.start();
    b.start();
    g.start();

    a.join();
    b.join();
    g.join();

    System.out.println("Application terminated");


  }
  
}
