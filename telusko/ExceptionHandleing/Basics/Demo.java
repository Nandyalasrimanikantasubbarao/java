import java.util.*;

public class Demo {
  public static void main(String[] args){
    System.out.println("Connection Established");

    try{
      
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Kindly Enter the Numerator for division");
      int n=sc.nextInt();
      
      System.out.println("Kindly Enter the Denominator for Division");
      int d=sc.nextInt();
      
      int res=n/d;
      
      System.out.println("Result is "+res);
    }catch(Exception e){
      System.out.println("Please enter non zero denominator");
    }

    System.out.println("Connection Terminated");
  }
  
  
}
