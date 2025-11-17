class Aeroplane{
  void fly(){
    System.out.println("Aeroplane flies");
  }

  void landing(){
    System.out.println("Aeroplane is landing");
  }
}

class CargoPlane extends Aeroplane{

}

class PassengerPlane extends CargoPlane
{

}

public class Inheritance {
  public static void main(String[] args) {
    CargoPlane cp=new CargoPlane();
    
    cp.fly();
    cp.landing();

    // PassengerPlane pp=new PassengerPlane();

    PassengerPlane c=new PassengerPlane();
    c.fly();
    c.landing();
  }
  
}
