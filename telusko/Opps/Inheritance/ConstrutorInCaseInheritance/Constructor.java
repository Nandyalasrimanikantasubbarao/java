class Alpha{
  int a,b;

  public Alpha(){
    a=10;
    b=20;
    System.out.println("Alpha with zero param constructor");
  }

  public Alpha(int a, int b){
    this.a=a;
    this.b=b;
    System.out.println("param constructor of Alpha");
  }

}

class Beta extends Alpha{
  int x,y;

  public Beta(){
    // super(2,3);
    this(4,44);
    x=1;
    y=2;
    System.out.println("Beta Zero param Constructor");
  }

  public Beta(int x,int y){
    
    this.x=x;
    this.y=y;
  }

  public void disp(){
    System.out.println("a ="+a);
    System.out.println("b ="+b);
    System.out.println("x ="+x);
    System.out.println("y ="+y);
  }
}

public class Constructor {
  public static void main(String[] args) {
    Beta b=new Beta();
    b.disp();
  }
  
}
