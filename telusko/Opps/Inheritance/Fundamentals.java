class Telusko{
  int age;

  void disp(){
    age=10;
    System.out.println("Telusko age is "+age+" yers old");
  }
}

class Alien extends Telusko
{

}
public class Fundamentals {
  public static void main(String[] args) {
    Telusko t=new Telusko();
    t.disp();

    Alien a=new Alien();
    
    a.disp();
  }
  
}
