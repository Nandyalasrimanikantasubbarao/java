class Animal{
  public void animalUsuallyHuntsAndEat(){
    System.out.println("Animal is eating..");
  }
}

class Tiger extends Animal
{
  // overriding parent class method to suite child requirement
  @Override
  public void animalUsuallyHuntsAndEat(){
    System.out.println("Tiger is hunts and eat...");
  }
}
public class Doutemo {
  public static void main(String[] args) {
    Tiger t=new Tiger();
    t.animalUsuallyHuntsAndEat();
  }
  
}
