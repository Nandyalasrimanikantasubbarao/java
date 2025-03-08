// enum Status{
//   Running,Failed,Pending,Success
// }
enum Laptop{
  Macbook(2000),xps(2200),Surface(1800),Thinkpad(1500);

  private int price;

  private Laptop(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

}

public class Demo {
  public static void main(String[] args) {
    int i=5;
    // Status s=Status.Running;
    // System.out.println(s);

    // Laptop lap=Laptop.Macbook;
    // System.out.println(lap+ " : "+lap.getPrice());

    for(Laptop lap :Laptop.values()){
      System.out.println(lap+" : "+lap.getPrice());
    }
    
    
  }
  
}
