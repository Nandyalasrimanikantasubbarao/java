import java.util.Arrays;

class Telusko{
  String courseName;
  int courseCost;
  String city;
}
public class Demo {
  public static void main(String[] args) {
    Telusko t=new Telusko();

    //gives object address of t object
    System.out.println(t);

    //Array operations
    int array[]={8,6,2,4};
    Arrays.sort(array);

    for(int i:array){
      System.out.print(i+" ");
    }

  }
}
