class A{
  public void show(){
    System.out.println("In show A");
  }

  public void config(){
    System.out.println("In A config");
  }
}

class B extends A{
  public void show(){
    System.out.println("In show B");
  }
}
public class Demo {
  public static void main(String[] args) {
    B obj=new B();
    obj.show();
    
  }
  
}
