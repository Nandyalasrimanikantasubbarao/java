abstract class Aeroplane{
  public abstract void takingOff();

  public abstract void fly();

  public abstract void landing();
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

public class Demo {
  public static void main(String[] args) {
    
  }
  
}
