class A{
  int age;

  public void show(){
    System.out.println("in show");

  }
  class B{
    public void config(){
      System.out.println("in Config");
    }
  }
}

public class Demo {
  public static void main(String[] args) {
    A obj=new A();
    obj.show();

    // inner class acessing using object
    A.B obj1=obj.new B();
    obj1.config();
    
  }
  
}
