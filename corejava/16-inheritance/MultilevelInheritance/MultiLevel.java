package MultilevelInheritance;



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

public class MultiLevel {
  public static void main(String[] args) {
    veryAdvCal obj=new veryAdvCal();
    int r1=obj.Add(5, 80);
    double r2=obj.power(2, 5);
    System.out.println(r1+" "+r2);
    
  }
  
}

