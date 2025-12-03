import java.io.IOException;

class Parent{
  public void work() throws ArithmeticException{
    System.out.println("parent");
  }
}

class Child1 extends Parent{
  public void work() throws ArithmeticException{
    System.out.println("Parent work hard");
  }
}

class Child2 extends Parent{
  public void work() throws IOException{
    System.out.println("Child work hard");

  }
}
public class Demo {
  public static void main(String[] args) {
    Parent p=new Parent();
    p.work();
    
  }
  
}
