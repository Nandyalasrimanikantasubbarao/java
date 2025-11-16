class Mani{
  
  {
      System.out.println("java initialization block 1");
  }
  
  {
      System.out.println("java initialization block 2");
  }

  static{
    System.out.println("static block 1");
  }

  static
  {
    System.out.println("static block 2");
  }
}
public class Static3 {
  public static void main(String[] args) {
    Mani a1=new Mani();
    Mani a2=new Mani();
  }
  
}
