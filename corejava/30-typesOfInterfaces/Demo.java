@FunctionalInterface
interface A{
  int add(int i,int j);
  
}
// @FunctionalInterface
// interface A{
//   void show(int i);
  
// }
// @FunctionalInterface
// interface A{
//   void show();
  
// }

// class B implements A{
//   public void show(){}

// }

public class Demo {
  public static void main(String[] args) {
    // lamda expresion
    // A obj = ()->
    // {
    //     System.out.println("in show");
    // };


    // A obj = (i)->
    // {
    //     System.out.println("in show"+i);
    // };

    //////lamda with return
    A obj = (i,j)-> i+j;
    int result=obj.add(5,8);
    System.out.println(result);
    
  }
  
}
