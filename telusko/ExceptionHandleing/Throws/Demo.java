import java.util.Scanner;

class Alpha {
  public void calc()throws ArithmeticException{
      Scanner sc=new Scanner(System.in);
      System.out.println("Alpha connection established");
      
      System.out.println("Kindly Enter the Numerator for division");
      int n=sc.nextInt();
      
      System.out.println("Kindly Enter the Denominator for Division");
      int d=sc.nextInt();
      
      int res=n/d;
      
      System.out.println("Result is "+res);

      System.out.println("Alpha connection Terminated");
  }
}

public class Demo {
  public static void main(String[] args){

    System.out.println("Main connection established");
    try{

      Alpha a=new Alpha();
      a.calc();
    } catch(ArithmeticException e){
      System.out.println("Main method thandled exception");
    }
    System.out.println("Main connection terminated");
    

  }
  
}
