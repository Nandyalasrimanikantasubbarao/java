class Aeroplane{
  public void takingOff(){
    System.out.println("Aeroplane must takeoff in order to fly");
  }

  public void landing(){
    System.out.println("Aeroplane is landing");
  }
}

class CargoPlane extends Aeroplane{
  public void takeOff(){
    System.out.println("CargoPlane requires lonnger runway to fly");
  }
  public void fly(){
    System.out.println("Cargo plane is flying");
  }
  public void landing(){
    System.out.println("Cargo is landing");
  }
}

class FigherPlane extends Aeroplane{
  public void takeOff(){
    System.out.println("Fighter plane requires small rauway to fly");
  }

  public void fly(){
    System.out.println("Fighter plane is flying");
  }
}

public class Upcasting {
  public static void main(String[] args) {
    Aeroplane cp=new CargoPlane(); //upcasting
    cp.takingOff();
    cp.landing();
    ((CargoPlane) cp).fly(); //downcasting

    Aeroplane fp=new FigherPlane();
    fp.takingOff();
    fp.landing();
  }
  
}
