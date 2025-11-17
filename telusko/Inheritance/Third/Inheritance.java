class Telusko1{
  // private varriables can't get inherited
  // private String name="Telusko";
  String name="Telusko";

  void disp(){
    System.out.println("Name is "+name);
  }
}

class Alien1 extends Telusko1{
  void disp2(){
    name="alien"
  }

}
public class Inheritance {
  public static void main(String[] args) {
    Alien1 a=new Alien1();
    a.disp();
  }
  
}
