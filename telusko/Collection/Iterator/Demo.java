import java.util.*;;
public class Demo {
  public static void main(String[] args) {
    ArrayList al=new ArrayList();

    al.add(100);
    al.add(100);
    al.add(200);
    al.add(300);
    al.add(500);
    al.add(600);

    Iterator itr=al.iterator();

    while(itr.hasNext()){
      Integer val=(Integer) itr.next();
      if(val>100){
        System.out.println(itr.next());
      }
    }
    
  }
  
}
