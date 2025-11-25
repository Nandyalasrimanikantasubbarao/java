// class A{
//   public void show(){
//     System.out.println("in A show");
//   }

// }

// class B extends A{
//   public void show(){
//     System.out.println("in B show");
//   }
// }

class Person{
  public void printName(){
    System.out.println("Suresh");
    
  }

  // static class phone{
  //   int price;
  //   String model;

  //   public void details(){
  //     System.out.println("Oneplus");
  //   }
  // }
  class phone{
    int price;
    String model;

    public void details(){
      System.out.println("Oneplus");
    }
  }
}

public class Demo {
  public static void main(String[] args) {
    // System.out.println("hi");

    // A obj=new B();
    // obj.show();

    Person obj=new Person();
    obj.printName();

    //acessing inner static class
    // Person.phone p=new Person.phone();
    // p.details();

    
    //acessing inner class
    Person.phone p=obj.new phone();
    p.details();
  }
  
}
