
public class Demo {
  public static void main(String a[]){
    String name=new String("mani");
    System.out.println("Hello "+name);
    System.out.println(name.concat("kanta"));

    // string buffer
    StringBuffer sb=new StringBuffer("mani");
    System.out.println(sb.capacity());
    sb.append(1);
    System.out.println(sb);

  }
  
}
