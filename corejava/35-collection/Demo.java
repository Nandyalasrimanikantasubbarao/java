import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
  public static void main(String[] args) {

    List<Integer> nums=new ArrayList<>();
    nums.add(4);
    nums.add(3);
    nums.add(4);
    nums.add(9);
    nums.add(1);

    Collections.sort(nums);
    System.out.println(nums);
    

    // Map<String,Integer> students=new HashMap<>();

    // students.put("Navin",45);
    // students.put("Mani", 20);

    // System.out.println(students);
    // System.out.println(students.get("Mani"));

    // for(String key:students.keySet()){
    //   System.out.println(key +" "+students.get(key));
    // }


    // List<Integer> nums=new ArrayList<Integer>();
    // // nums.add("mani");
    // nums.add(7);
    // nums.add(8);
    // nums.add(9);
    // System.out.println(nums.get(2));
    // System.out.println(nums.indexOf(7));
    
  //   Set<Integer> value=new HashSet<Integer>();
    
  //   value.add(8);
  //   value.add(7);
  //   value.add(8);
  //   value.add(9);
  //   for(int n:value){
  //     System.out.println(n);
  //   }

  //   Set<Integer> value1=new TreeSet<Integer>();
    
  //   value1.add(7);
  //   value1.add(8);
  //   value1.add(8);
  //   value1.add(9);
  //   // for(int n:value1){
  //   System.out.println(value1);
  //   // }
    
  }
  
}
