public class Demo {
  public static void main(String[] args) {
    String s1="Manikanta";
    // System.out.println(str.length());
    // System.out.println(str.toUpperCase());
    // System.out.println(str.indexOf("M"));
    // char ch[]=str.toCharArray();
    // for(char c:ch){
    //   System.out.println(c);
    // }

    String [] str=s1.split("");

    for(String s:str){
      System.out.println(s);
    }

    System.out.println(str.length);
  }
}
