abstract class Car{
  public abstract void drive();
  
  public void playMusic(){
    System.out.println("play music");
  }
}

class Wagon extends Car{
  public void drive(){
    System.out.println("Driving");
  }

}

public class demo {
  public static void main(String[] args) {
    Car obj=new Wagon();
    obj.drive();
    obj.playMusic();
    
  }
  
}
