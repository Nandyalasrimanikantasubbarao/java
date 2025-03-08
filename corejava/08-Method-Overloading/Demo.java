class Calculator{
  public int add(int a,int b){
    return a+b;
  }
  public int add(int a,int b,int c){
    return a+b+c;
  }
}

public class Demo {
  public static void main(String a[]){
    Calculator cal=new Calculator();
    int value=cal.add(10,10,10);
    System.out.println(value);

  }
  
}
