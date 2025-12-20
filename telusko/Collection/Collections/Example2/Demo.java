import java.util.*;

class Cricketer{
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
}

class Alpha1 implements Comparator<Cricketer>{
  @Override
  public int compare(Cricketer o1,Cricketer o2){
    if(o1.avg>o2.avg){
      return 1;
    }else{
      return -1;
    }
  }
}
public class Demo {
  public static void main(String[] args) {
    Cricketer c1=new Cricketer(35,"Virat",67.1 );
    Cricketer c2=new Cricketer(36,"ROhit",58.1 );
    Cricketer c3=new Cricketer(39,"Dhoni",43.9 );

    ArrayList<Cricketer> list=new ArrayList<>();

    list.add(c1);
    list.add(c2);
    list.add(c3);

    System.out.println(list);
    Alpha1 a=new Alpha1();
    Collections.sort(list,a);
    System.out.print(list);
  }
  
}
