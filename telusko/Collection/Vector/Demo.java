import java.util.*;

public class Demo {
  public static void main(String[] args) {
    Vector v=new Vector();
    v.add(100);
    v.add(200);
    v.add(300);

    System.out.println(v);

    Iterator itr=v.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }
  
}
