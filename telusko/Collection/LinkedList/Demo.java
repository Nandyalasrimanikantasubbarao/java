import java.util.LinkedList;

public class Demo {
  public static void main(String[] args) {
    LinkedList l1=new LinkedList();
    l1.addFirst(10);
    l1.add("Java");
    l1.add(90);
    l1.addLast(89);

    
    l1.remove(0);

    
    System.out.println(l1.contains("Java"));

    

    System.out.println(l1);
    System.out.println(l1.peek());
    System.out.println(l1.poll());


  }
}
