class Aeroplane{
  public void takingOff(){
    System.out.println("Aeroplane must takeoff in order to fly");
  }
  public void fly(){
    System.out.println("Aerplane plane is flying");
  }

  public void landing(){
    System.out.println("Aeroplane is landing");
  }
}

class CargoPlane extends Aeroplane{
  public void takingOff(){
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
  public void takingOff(){
    System.out.println("Fighter plane requires small rauway to fly");
  }
  
  public void fly(){
    System.out.println("Fighter plane is flying");
  }

  public void landing(){
    System.out.println("Fighter plane is landing");
  }
}

public class Upcasting {
  public static void main(String[] args) {

    CargoPlane cp=new CargoPlane();

    FigherPlane fp=new FigherPlane();

    Aeroplane areoplane;
    areoplane=cp;

    
    areoplane.takingOff();
    areoplane.fly();
    areoplane.landing();
    
    areoplane=fp;

    areoplane.takingOff();
    areoplane.fly();
    areoplane.landing();

  }
  
}
