import java.util.TreeSet;

public class Demo {
  public static void main(String[] args) {
    TreeSet ts=new TreeSet();

    
    ts.add(100);
    ts.add(120);
    ts.add(10);
    ts.add(130);
    ts.add(140);
    ts.add(150);
    ts.add(160);
    ts.add(25);

    

    System.out.println(ts);
    System.out.println(ts.ceiling(101));
    System.out.println(ts.higher(50));
    
    System.out.println(ts.floor(50));
    
    
  }
  
}
