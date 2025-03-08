
public class Demo {
  public static void main(String[] args) {
    int num=7;

    // boxing
    Integer num1=new Integer(8);
    System.out.println(num1);

    // autoboxing
    Integer num2=num;
    System.out.println(num2);

    // unboxing
    int num3=num2.intValue();
    System.out.println(num3);

    // Auto-unboxing
    int num4=num1;
    System.out.println(num4);



  }
  
}
