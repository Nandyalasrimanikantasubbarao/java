interface Calc{
  void add(int a,int b);
  void sub(int a,int b);
}

interface Calc1{
  void add(int a,int b);
  void sub(int a,int b);
}

class Cal1{

}

class MyCal1 extends Cal1 implements Calc,Calc1{
  public void add(int a,int b){
    System.out.println(a+b);
  }
  public void sub(int a,int b){
    System.out.println(a-b);
  }
}

class MyCal2 implements Calc{
   public void add(int a,int b){
    int res=a+b;
    System.out.println(res);
  }
  public void sub(int a,int b){
    int res=a-b;
    System.out.println(res);
  }
}

class Algebra{
  public void cal(Calc c,int a,int b){
    c.add(a, b);
    c.sub(a, b);
  }
}

public class Demo {
  public static void main(String[] args){

    Calc calc1=new MyCal1();
    // calc1.add(33,7);
    // calc1.sub(40, 7);

    Calc calc2=new MyCal2();
    // calc2.add(22,8);
    // calc2.sub(30, 8);

    Algebra a=new Algebra();
    a.cal(calc1, 10, 20);
    a.cal(calc2, 10, 20);

  }
  
}
