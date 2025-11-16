import java.util.Scanner;

class Farmer{
  float pa;
  float td;
  float si;

  static float roi;
  static{
    roi=2.5f;
  }

  void acceptInput(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Kindly enter loan amout requires in rupees");
    pa=sc.nextFloat();
    System.out.println("Kindly enetr time duration trequired to repay loan in months");
    td=sc.nextFloat();
  }

  void compute(){
    si=(pa*roi*td)/100.0f;
  }

  void disp(){
    System.out.println("Hello, Your SI is:"+si);
  }
}
public class BasicProject {
  public static void main(String[] args) {
    Farmer f1=new Farmer();
    Farmer f2=new Farmer();
    Farmer f3=new Farmer();

    // farmer 1
    f1.acceptInput();
    f1.compute();
    f1.disp();

    // farmer 2
    f2.acceptInput();
    f2.compute();
    f2.disp();

    // farmer 3
    f3.acceptInput();
    f3.compute();
    f3.disp();
  }
  
}
