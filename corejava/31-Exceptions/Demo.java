// //custom exception
class myException extends Exception{
  public myException(String string){
    super(string);
  }
}
public class Demo {
  public static void main(String[] args) {
    int nums[]=new int[5];
    int i=0;
    int j=0;
    try{
      // int j=18/i;
      if(j==0) throw new myException("I dont know how it works");
      if(j==0) throw new ArithmeticException();
      // System.out.println(j);
      // System.out.println(nums[8]);
    }catch(ArithmeticException err){
      System.out.println("something went wrong "+err);

    }
    catch(myException err){
      System.out.println("something went wrong "+err);

    }
    // catch(ArrayIndexOutOfBoundsException err){
    //   System.out.println("sothing went wrong "+err);
    // }
    catch(Exception e){
      System.out.println("ok");
    }
    System.out.println("hi");
  }
}
