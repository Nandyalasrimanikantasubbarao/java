import java.util.*;
public class Demo {
  public static void main(String[] args){
    ArrayList al=new ArrayList();

    HashSet hs=new HashSet<>();

    al.add(100);
    al.add(100);
    al.add(200);
    al.add("Mani");
    al.add(0,true);

    
    al.forEach((val)->{
      System.out.println(val);
    });

    
    
    

    

    System.out.println(al);
    hs.addAll(al);
    System.out.println(hs);

    al.remove(true);
    System.out.println(al);
  
    System.out.println(al.get(0));

    for(int i=0;i<al.size();i++){
      System.out.println(al.get(i));
    }

  }
}
