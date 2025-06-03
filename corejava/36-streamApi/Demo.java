import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Demo {
  public static void main(String[] args) {
    // List<Integer> nums=new ArrayList<>();
    List<Integer> nums=Arrays.asList(3,4,5,2,51,9);

    int result=nums.stream()
                  .filter(n->n%2==0)
                  .map(n->n*2)
                  .reduce(0,(c,e)->c+e );
    System.out.println(result);

    // Stream<Integer> s1=nums.stream();

    //////forEach
    // s1.forEach(n->{
    //   if(n%2==0){
    //     System.out.println(n);
    //   }
    // });

    // List<Integer> s2=s1.filter(n -> n%2==0).collect(Collectors.toList());

    // Stream<Integer> s3=s1.map(n -> n*2);

    // int s4=s3.reduce(0,(c,e)->c+e);

    // System.out.println(s2);
    // System.out.println(s3);
    // System.out.println(s4);



    
    // int sum=0;
    // for(int n:nums){
    //   if(n%2==0){
    //     n=n*2;
    //     sum=sum+n;
    //   }
    // }
    // System.out.println(nums);
    // System.out.println(sum);

  }
  
}
