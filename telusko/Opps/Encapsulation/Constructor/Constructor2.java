class Demo{
  int num1,num2;
  Demo(){
    super();
    System.out.println("Zero param constructor");
  }
  
  Demo(int num1,int num2){
    this.num1=num1;
    this.num2=num2;

    System.out.println("Two param constructor");

  }

  Demo(int num1){
    this(3,4);
    this.num1=num1;
    num2=44;
    System.out.println("one param COnstructor");
  }

  void disp(){
    System.out.println("num1: "+num1);
    System.out.println("num2: "+num2);
  }
}
public class Constructor2 {
  public static void main(String[] args) {
    Demo d1=new Demo(4);
    d1.disp();
  }
  
}
