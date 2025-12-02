import java.util.Scanner;

class Alpha{
  public void calc(){
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

class Beta{
  public void disp(){
    System.out.println("Beta connection established");
    Alpha a=new Alpha();
    a.calc();
    System.out.println("Beta connection Terminated");
  }
}
public class Demo {
  public static void main(String[] args){

    System.out.println("Main connection established");
    Beta b=new Beta();
    b.disp();
    System.out.println("Main connection terminated");
    

  }
  
}
