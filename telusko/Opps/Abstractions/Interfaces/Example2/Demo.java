interface Telusko{
  void show();
  default void disp(){
    System.out.println("Telusko is coming up with fact spring boot course");
  }
}

class Alien implements Telusko{
  class 
  public void show(){
    System.out.println("Hello Aliens");
  }
}

public class Demo {
  public static void main(String[] args) {
    Telusko a=new Alien();
    a.disp();
    a.show();
    
  }
  
}
