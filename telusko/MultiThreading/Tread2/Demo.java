import java.util.*;

public class Demo {
  public static void main(String[] args) throws InterruptedException{
    System.out.println("Application Started....");

    System.out.println("Banking Activity Started");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the user number");
    int un=sc.nextInt();
    System.out.println("Enter the password");
    int pass=sc.nextInt();
    System.out.println("Collect your cash");
    System.out.println("Banking Activity terminated");

    System.out.println("Printing Activity started..");

    for(int i=0;i<=4;i++){
      System.out.println("**");
      Thread.sleep(4000)
    }

    System.out.println("Application terminated...");
  }
  
}
