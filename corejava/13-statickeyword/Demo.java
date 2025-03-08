class Mobile{
  String brand;
  int price;
  static String name;

  static{
    name="Phone";
  }

  public Mobile(){
    brand="";
    price=200;

  }

  void Show(){
    System.out.println(brand +" : "+price+" : "+name );
  }

  public static void show1(Mobile obj){
    System.out.println(obj.brand+" "+obj.price+" "+name);
  }

}
public class Demo {
  public static void main(String a[]){
    // Static variables
    Mobile obj1=new Mobile();
    obj1.brand="Apple";
    obj1.price=15000;
    
    
    Mobile obj2=new Mobile();
    obj2.brand="Samsung";
    obj2.price=10000;

    // Mobile.name="Smart Phone";

    obj1.Show();
    obj2.Show();

    Mobile.show1(obj);
  }
  
}
