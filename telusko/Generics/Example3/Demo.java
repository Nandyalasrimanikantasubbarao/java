import java.lang.reflect.Array;
import java.util.*;

public class Demo {
  public static void main(String[] args) {
    List<Integer> list=new ArrayList<>();
    // List<Integer> list2=new LinkedList<>();

    List<Integer> l=Arrays.asList(10,0,30);
    
    arr();
  }

  public static Iterable<Integer> getIntegers(){
    return new ArrayList<Integer>();
  }

  public static int[] arr(){
    int arr[]={2,3,45,6};
    return arr;
  }
  
}
