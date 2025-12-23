import java.util.*;

class Cricketer implements Comparable<Cricketer>{
  int age;
  String name;
  double avg;

  public Cricketer(int age,String name,double avg){
    super();
    this.age=age;
    this.name=name;
    this.avg=avg;
  }

  @Override
  public String toString(){
    return "Cricketer [age="+age+" name="+name+", avg"+avg+"]";
  }


  @Override
  public int compareTo(Cricketer o){
    if(this.avg<o.age){
      return 1;
    }else{
      return -1;
    }
  }
}


public class Demo {
  public static void main(String[] args) {
    Cricketer c2=new Cricketer(36,"ROhit",58.1 );
    Cricketer c1=new Cricketer(35,"Virat",67.1 );
    Cricketer c3=new Cricketer(39,"Dhoni",43.9 );

    ArrayList<Cricketer> list=new ArrayList<>();

    list.add(c1);
    list.add(c2);
    list.add(c3);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
  }
  
}
