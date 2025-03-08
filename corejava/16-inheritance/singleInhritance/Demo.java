package singleInhritance;
import MultilevelInheritance.AdvCal;
import MultilevelInheritance.Cal;

class Cal {
  public int Add(int a,int b){
    return a+b;
  }

  public int sub(int a,int b){
    return a-b;
  }
  
  
}


 class AdvCal extends Cal{
  public int multi(int a,int b){
    return a*b;
  }

  public int div(int a, int b){
    return a/b;
  }
  
}

class veryAdvCal extends AdvCal{
  public double power(int a,int b){
    return Math.pow(a,b);
    
  }
}

public class Demo {
  public static void main(String[] args) {
    AdvCal obj=new AdvCal();
    int r1=obj.Add(5, 80);
    System.out.println(r1);
    
  }
  
}
