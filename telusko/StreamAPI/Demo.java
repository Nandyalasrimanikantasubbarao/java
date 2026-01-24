// import java.util.Arrays;
import java.util.*;
import java.util.function.*;

public class Demo {
  public static void main(String[] args) {
    List<Integer> list=new ArrayList<>();

    list.add(5);
    list.add(3);
    list.add(7);
    list.add(2);
    list.add(9);

    System.out.println(list);

    // for(Integer i:list){
    //   System.out.println(i);
    // }

    // Consumer<Integer> consumer=new Consumer<>() 
    // {
    //   @Override
    //   void accept(Integer n){
    //     System.out.println(n);
    //   }
    // };

    // Consumer<Integer> consumer=(Integer n)->System.out.println(n);

    list.forEach((n)->System.out.println(n));

  }
  
}
