class Claculator{

  public int Add(int a,int b){
    System.out.println("in add");
    return a+b;

  }
}
public class Demo {
  public static void main(String a[]){
    int num1=4;
    int num2=5;
    Claculator calc=new Claculator();
    int value=calc.Add(num1,num2);
    System.out.println(value);
  }
  
}

// Object oriented programing