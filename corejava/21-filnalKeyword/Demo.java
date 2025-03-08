// final - variable,method and class

class Cal{
  public final void show(){
    System.out.println("show");
  }
  public void add(int a,int b){
    System.out.println(a+b);
  }
}
class AdvCal extends Cal{

}

public class Demo {
  public static void main(String[] args) {
    ///// final variables
    // final int num=9;
    // System.out.println(num);

    AdvCal obj=new AdvCal();
    obj.show();

    
    
  }
  
}
