public class Ternary {
  public static void main(String[] args) {
    int num1=14;
    int num2=4;

    // if(num1>num2){
    //   System.out.println("num1 is greater");
    // }else{
    //   System.out.println("num2 is greater");
    // }

    // using ternary
   int res=(num1>num2) ? num1:num2 ;

   System.out.println(res +" is greater number");

   int n1=2,n2=4,n3=5;
   int result=(n1>n2)? (n1>n3 ? n1:n3) :(n2>n3 ? n2 :n3);
   System.out.println(result);
  }
  
}
