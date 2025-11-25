class A{
  public void show(){
    System.out.println("in A show");
  }
}

class B extends A{
  public void show(){
    System.out.println("in B show");
  }
}
public class Demo {
  public static void main(String[] args) {

    A obj=new A(){ //annymus inner class
      public void show(){
        System.out.println("in new show");
      }
    };

    obj.show(); 
  }
}
