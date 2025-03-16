

public class Demo {
  public static void main(String[] args) {
    int i=0;
    int j=0;

    try{
      j=19/i;
    }catch(ArithmeticException e){
      System.out.println("something went wrong"+e);
    }finally{
      System.out.println("bye");
    }
  }
  
}
