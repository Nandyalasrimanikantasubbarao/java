class Aeroplane //extends Object
{
  void fly(){
    System.out.println("Aeroplane flies");
  }

  void landing(){
    System.out.println("Aeroplane is landing");
  }
}

class CargoPlane extends Aeroplane //extends object
{

}


class PassengerPlane extends CargoPlane
{
  void fly(){
    System.out.println("Passenger plane Aeroplane flies");
  }
  void takeOff(){
    System.out.println("Passenger plane stakes off");
  }

}

public class Inheritance {
  public static void main(String[] args) {
    // CargoPlane cp=new CargoPlane();
    
    // cp.fly();
    // cp.landing();

    // // PassengerPlane pp=new PassengerPlane();

    // PassengerPlane c=new PassengerPlane();
    // c.fly();
    // c.landing();

    Aeroplane plane=new PassengerPlane();
    plane.fly();
    // plane.takeOff();
    ((PassengerPlane) plane).takeOff();
  }
  
}
