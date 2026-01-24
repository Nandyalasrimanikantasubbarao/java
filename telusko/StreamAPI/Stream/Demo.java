import java.util.stream.Stream;
import java.util.*;

public class Demo {
  public static void main(String[] args) {
    List<Integer> list=new ArrayList<>();

    list.add(5);
    list.add(3);
    list.add(7);
    list.add(2);
    list.add(9);

    // Stream<Integer> streamData1=list.stream();

    // Stream<Integer> sortedStream=streamData1.sorted();

    // sortedStream.forEach(n->System.out.println(n));

    // Stream<Integer> streamData2=sortedStream.map(n->n*2);

    // System.out.println(streamData2);
    // sortedStream.map(n->n*2).forEach(n->System.out.println(n));

    // list.stream()
    //   .sorted()
    //   .map(n->n*2)
    //   .forEach(n->System.out.print(n+" "));

    // String n="ALIEN";

    // n.toLowerCase();

    list.stream()
      .filter(fil->fil%2==0)
      .map(fil->fil*2)
      .forEach(fil->System.out.print(fil+" "));
    
    
    
  }
  
}
