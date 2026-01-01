import java.util.*;

public class Demo {
  public static void main(String[] args) {
    TreeMap tm=new TreeMap<>();
    tm.put(1, "Hibernate");
    tm.put(2,"SpringBoot");
    System.out.println(tm);

    // values looping
    Collection<String> values=tm.values();
    Iterator<String> itr=values.iterator();

    while(itr.hasNext()){
    System.out.println(itr.next());
    }

    // key looping
    Set<Integer> keys=tm.keySet();
    Iterator<Integer> itr2=keys.iterator();
    while(itr2.hasNext()){
      System.out.println(itr2.next());
    }

    // both keys and values looping
    Set entry=tm.entrySet();
    Iterator itr3=entry.iterator();
    while(itr3.hasNext()){
      Map.Entry pair=(Map.Entry) itr3.next();
      System.out.println("key :"+pair.getKey()+"Values"+pair.getValue());
    }
  }
  
}
