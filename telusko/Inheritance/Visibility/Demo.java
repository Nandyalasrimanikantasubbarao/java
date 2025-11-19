class Plane{

}
class FighterPlane extends Plane{

}

class Animal{
  public void eat(){
    System.out.println("Animals are required to eat");
  }
  void sleep(){
    System.out.println("Animals are sleeping");
  }

  public void running(){
    System.out.println("Animals are running");
  }

  public Plane run(){
    return new Plane();
  }
  
}

class Tiger extends Animal{
  
  // void eat(){ //can't reduce the visibility of inherited methods
  //   System.out.println("Animals are required to eat");
  // }
  
  public void sleep(){ //we can increse the visibility of inherited methods
    System.out.println("Animals are sleeping");
  }
  
  // public int running(){ //can't change primitive type returns
  //   System.out.println("Animals are running");
  //   return 10;
  // }

  public FighterPlane run(){ //we can override if the return type has is A relation ship
    return new FighterPlane();
  }
}
public class Demo {
  public static void main(String[] args) {
    
    Animal a=new Animal();
    a.eat();
  }
}
