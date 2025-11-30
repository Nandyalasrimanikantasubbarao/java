public class Demo {
  public static void main(String[] args) {
    String str="Manikanta";
    System.out.println(str.length());
    System.out.println(str.toUpperCase());
    System.out.println(str.indexOf("M"));
    char ch[]=str.toCharArray();
    for(char c:ch){
      System.out.println(c);
    }
  }
}
