public class Wrappers {
  public static void main(String[] args) {
    int a=10;
    // Integer i=new Integer(a);
    // boxing
    Integer i=Integer.valueOf(a);
    System.out.println("i ="+i);

    // auto-Boxing
    Integer val=a;
    System.out.println(val);

    // unboxing
    Integer n1=10;
    int n2=n1.intValue();
    
    // Auto unboxing
    Integer n3=10;
    int n4=n3;

    
  }
  
}
