
class Demo{
  public static void main(String a[]){
    int x=8;
    int y=9;
    int z=10;

    if(x>y && x>z){
      System.out.println(x);
    }
    else if(y>z){
      System.out.println(y);
    }else{
      System.out.println(z);
    }

    // Ternery operator
    int ternery1=9;
    int ternery2=10;

    var value= ternery1>ternery2 ? ternery1:ternery2;
    System.out.println("Maximum value is "+value);

  }

}