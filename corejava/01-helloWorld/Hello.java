public class Hello{
  public static int num1=9;
  public static int num2=10;
  public static int Add(int a,int b){
    return a+b;
  }
  public static void main(String args[]){
    System.out.println("Hello World");
    int value=Add(num1,num2);
    System.out.println("sum is "+value);
  
  }
}