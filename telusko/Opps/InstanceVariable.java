class Calc{

  // instance variable
  int num1;
  int num2;

  void add(){

    num1=10;
    num2=20;
    
    // local variable
    int res=num1+num2;

    System.out.print(res);
  }
}
public class InstanceVariable {
  public static void main(String[] args) {
    Calc cal=new Calc();

    cal.add();
  }
  
}
