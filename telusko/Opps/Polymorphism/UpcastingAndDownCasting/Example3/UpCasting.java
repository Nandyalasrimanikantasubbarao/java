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

class PssingerPlane extends Aeroplane{
  public void takingOff(){
    System.out.println("PssingerPlane requires small rauway to fly");
  }
  
  public void fly(){
    System.out.println("PssingerPlane is flying");
  }

  public void landing(){
    System.out.println("PssingerPlane is landing");
  }
}

class Airport{
  public void permit(Aeroplane aeroplane){
    aeroplane.takingOff();
    aeroplane.fly();
    aeroplane.landing();
  }
}

public class UpCasting {
  public static void main(String[] args) {
    CargoPlane cp=new CargoPlane();

    FigherPlane fp=new FigherPlane();

    PssingerPlane pp=new PssingerPlane();
    

    Airport a=new Airport();

    a.permit(cp);
    a.permit(fp);
    a.permit(pp);


  }
  
}
