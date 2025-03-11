class A{
  public void show(){
    System.out.println("in A show");
  }
  
}


class B extends A{
  
  @Override //annotation method
  public void show(){
    System.out.println("in B show");
  }
}

public class Demo{
  public static void main(String[] args) {
    B obj=new B();
    obj.show();
    
  }
}