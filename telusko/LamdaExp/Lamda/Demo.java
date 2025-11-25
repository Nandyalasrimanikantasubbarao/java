// abstract class P{
//   abstract void show();
// }

interface P{
  void show();
}

//interfaces Type ->
// noraml(interface with multiple methods)
//SAM{single abstarct method interface} also called function interface
//Marker interface(interface with no methods)

interface Person{
  int add(int a,int b);
}

class PersonImpl implements Person{
  public int add(int x,int y){
    return x+y;
  }
}

// class R extends P{
//   public void show(){
//     System.out.println("in show");
//   }
// }

public class Demo {
  public static void main(String[] args) {
    // P obj =new R(){
    //   public void show(){
    //     System.out.println("in show");
    //   }
    // };

    //this will work if abstarct class or interface with one method
    P obj =()->System.out.println("in show");

    obj.show();


    Person obj1=(x,y)->x+y;

    int result=obj1.add(2,4);
    System.out.println(result);
      
    

  }
  
}
