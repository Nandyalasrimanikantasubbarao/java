class Dog{
  private int cost;
  private String name;
  private String color;

  Dog(int cost,String name,String color){
    this.cost=cost;
    this.name=name;
    this.color=color;
  }

  Dog(){
    System.out.println("Zero param constructor");
  }

  public int getCost() {
    return cost;
  }

  public String getName() {
    return name;
  }
  public String getColor() {
    return color;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }
  

}
public class Fundamentals {
  public static void main(String[] args) {

    Dog d1=new Dog(400,"Chintu","White");

    System.out.println(d1.getCost());
    System.out.println(d1.getName());
    System.out.println(d1.getColor());

    Dog d2=new Dog();
    
  }
  
}
