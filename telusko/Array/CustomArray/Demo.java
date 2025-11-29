class Alien{
  int id;
  String name;
  String course;

}
public class Demo {
  public static void main(String[] args){
    Alien[] arr=new Alien[3];

    arr[0]=new Alien();
    arr[1]=new Alien();
    arr[2]=new Alien();

    arr[0].id=1;
    arr[0].name="Mani";
    arr[0].course="Java";

    System.out.print(arr.getClass());

  }
  
}
