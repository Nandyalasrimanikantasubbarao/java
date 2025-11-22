// interface Demo1{
//   void disp();
// }

// interface Demo2 implements Demo1{
  
// }

// interface Demo1{
//   void disp();
// }

// interface Demo2 extends Demo1{

// }

interface Demo1{
  void disp();
  float pi=3.14f; //default all variables are public static final
}

interface Demo2{
  void disp();

}

class Alpha implements Demo1,Demo2{
  public void disp(){
    System.out.println("Hello from Alpha");
  }
}
public class Demo {
  public static void main(String[] args) {
    Demo1 d=new Alpha();
    d.disp();
    
  }
  
}
