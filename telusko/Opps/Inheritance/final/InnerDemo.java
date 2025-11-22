// ////final class

// final class Plane {
//   int a;
//   void disp(){
//     System.out.println("hi");
//   }
// }

// class FighterPlane extends Plane {

  
// }

/////final methods(it can't override)
// class Plane {
//   int a;
//   final void disp(){
//     System.out.println("hi");
//   }
// }

// class FighterPlane extends Plane {
  
//   final void disp(){
//     System.out.println("hii");
//   }
  
// }

// //final variable(we can't reassign)
class Plane {
  final int a=10;
  final void disp(){
    // a=20;
    System.out.println("hi");
  }
}

class FighterPlane extends Plane {
  
  
}
public class InnerDemo {
  public static void main(String[] args) {
    Plane p=new Plane();
    p.disp();
  }
  
}
