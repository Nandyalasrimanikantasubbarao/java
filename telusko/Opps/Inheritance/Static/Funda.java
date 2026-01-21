class Demo4{
  static int a;
  int b;
  public static void disp(){
    a=10;
    System.out.println(a+" Parent class disp");
  }

  public void disp1(){
    System.out.println(" Parent class disp with out static"+a);
  }
}

class Demo5 extends Demo4{
  
  public static void disp(){
    a=10;
    System.out.println(a+" child class disp");
  }

  public void disp1(){
    System.out.println(" child class disp with out static");
  }
}

public class Funda {
  public static void main(String[] args) {
    Demo4 d=new Demo5();
    // d.disp();
    d.disp1();
  }
  
}
