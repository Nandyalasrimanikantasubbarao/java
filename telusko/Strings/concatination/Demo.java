public class Demo {
  public static void main(String[] args) {
    // String str1="Telusko";
    
    // System.out.println(str1);

    // str1=str1.concat(" Manikanta");
    
    // System.out.println(str1);

    String s1="Telusko";
    // s1+"java";
    System.out.println(s1);

    String a1="14123";
    char arr[]=a1.toCharArray();
    int value=0;

    for(char c:arr){
      value+=Integer.parseInt(String.valueOf(c));
    }
    
    Integer a2=Integer.parseInt(a1);
    System.out.println(value);
  }
  
}
