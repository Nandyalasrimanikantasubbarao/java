import java.util.*;

public class Dem {
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

      System.out.println("Kindly enter the length of an array");
      int len=sc.nextInt();

      int ar[]=new int[len];

      System.out.println("Kindly enter element to be inserted in an array");
      int elem=sc.nextInt();

      System.out.println("kindly eneter position at which element to be inserted");
      int index=sc.nextInt();
      ar[index]=elem;

      System.out.println("Data inserted in a array "+ar[index]);

    }catch(ArithmeticException e){
      
      System.out.println("please enter non zero numbers");

    }catch(NegativeArraySizeException e){

      System.out.println("Please enter non zero numbers");
      
    }catch(ArrayIndexOutOfBoundsException e){

      System.out.println("Be within your limits");
    }
    catch(Exception e){
      System.out.println("some error");
    }

    System.out.println("Connection Terminated");
  }
  
  
}
