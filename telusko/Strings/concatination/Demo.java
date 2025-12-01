public class Demo {
  public static void main(String[] args) {
    // String str1="Telusko";
    
    // System.out.println(str1);

    // str1=str1.concat(" Manikanta");
    
    // System.out.println(str1);

    // String s1="Telusko";
    // // s1+"java";
    // System.out.println(s1);

    // String a1="14123";
    // char arr[]=a1.toCharArray();
    // int value=0;

    // for(char c:arr){
    //   value+=c-'0';
    // }

    // System.out.println(value);
    
    // Integer a2=Integer.parseInt(a1);
    // System.out.println(value);

    String s1="sachin";
    String s2="SACHIN";

    int val=s1.compareTo(s2);

    if(val==0){
      System.out.println("Both are equal");
    }else{
      System.out.println("Both are not equal"+val);
    }
  }
  
}
