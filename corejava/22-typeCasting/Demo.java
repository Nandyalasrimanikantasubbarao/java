class A{
  public void show1(){
    System.out.println("in A show");
  }

}
class B extends A{
  public void show2(){
    System.out.println("in B show");
  }

}
public class Demo {
  public static void main(String[] args) {
    // typeCasting
    double d=4.5;
    int i=(int) d;
    System.out.println(i);

    // upcasting
    A obj=(A)new B();
    obj.show1();

    // downCasting
    B obj1=(B) obj;
    obj1.show2();
    
  }
  
}
