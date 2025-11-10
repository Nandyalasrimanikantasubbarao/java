class AdditionCal{
  int add(int n1,int n2){
    return n1+n2;
  }

  int add(int n1,int n2,int n3){
    return n1+n2+n3;
  }

  double add(int n1,double n2){
    return n1+n2;
  }

  double add(double n1,double n2){
    return n1+n2;
  }

  double add(double n1,double n2,double n3){
    return n1+n2+n3;
  }
}


public class MethodOverloading {
  public static void main(String[] args) {
    int a=10;
    int b=20;
    int c=30;

    double x=10.5;
    double y=20.5;
    double z=30.5;

    AdditionCal cal=new AdditionCal();

    System.out.print(cal.add(a, b)+" ");

    System.out.print(cal.add(x, y)+" ");

    System.out.print(cal.add(a, x)+" ");

    System.out.print(cal.add(a, b, c)+" ");

    System.out.print(cal.add(x, y, z)+" ");
  }
  
}
