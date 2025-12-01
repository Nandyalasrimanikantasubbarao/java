public class Demo {
  public static void main(String[] args) {
    // StringBuffer sb1=new StringBuffer("Telusko");
    // StringBuffer sb2=new StringBuffer("Telusko");

    // System.out.println(sb1);

    // sb1.append(" Class");

    // System.out.println(sb1);

    StringBuilder sb1=new StringBuilder();
    StringBuffer sb2=new StringBuffer();

    
    
    System.out.println(sb1);
    
    sb1.append(" Class name please");
    sb2.append(" Class name please");
    
    System.out.println(sb1.capacity());
    System.out.println(sb1);
    System.out.println(sb2.capacity());
    

  }
  
}
