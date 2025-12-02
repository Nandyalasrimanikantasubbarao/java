import java.util.Scanner;

class Alpha {
  public void calc(){
    try{

      Scanner sc=new Scanner(System.in);
      System.out.println("Alpha connection established");
      
      System.out.println("Kindly Enter the Numerator for division");
      int n=sc.nextInt();
      
      System.out.println("Kindly Enter the Denominator for Division");
      int d=sc.nextInt();
      
      int res=n/d;
      
      System.out.println("Result is "+res);
      

    }catch(ArithmeticException e){
      System.out.println("Handled in Alpha");
      throw e;
    }
    finally{
      System.out.println("Alpha connection terminated");
    }
  }
}

public class Demo {
  public static void main(String[] args){

    System.out.println("Main connection established");
    

      Alpha a=new Alpha();
      a.calc();
   
    System.out.println("Main connection terminated");
    

  }
  
}
