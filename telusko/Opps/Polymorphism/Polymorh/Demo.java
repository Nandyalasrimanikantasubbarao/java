class Animal{
  public void eat(){

    System.out.println("Animal is eating");
  }

  public void running(){
    System.out.println("Animal is running");
  }
}

class Tiger extends Animal{
  public void eat(){
  
    System.out.println("Tiger hunts and eats");
  }
  
  public void running(){
    System.out.println("Tiger is running for catching the pray");
  }
  
}

class Monkey extends Animal{
  public void eat(){
  
    System.out.println("Monkey is eating banana");
  }
  
  public void running(){
    System.out.println("Monkey is running for staling the other monkey food");
  }
}

class Forest{
  public void permit(Animal animal){
    animal.eat();
    animal.running();
  }
}
public class Demo {
  public static void main(String[] args) {
    Tiger t=new Tiger();

    Monkey m=new Monkey();

    Forest f=new Forest();

    f.permit(m);
    f.permit(t);
    
  }
}
