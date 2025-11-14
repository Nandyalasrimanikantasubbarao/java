// class Demo{
//   static int a,b,c;

//   // int x,y,z;

//   static{
//     System.out.println("static init block");
//     a=10;
//     b=20;
//     c=30;
//   }

//   static void disp(){
//     System.out.println("a ="+a);
//     System.out.println("b ="+b);
//     System.out.println("c ="+c);
//   }
// }

public class Static {
  static int a;

  static{
    a=10;
    System.out.println("a ="+a);
  }
  public static void main(String[] args) {
    // Demo.disp();
    System.out.println("Main method");
  }
  
}
