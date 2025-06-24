class Calculator{
  public void playMusic(){
    System.out.println("Music playing");
  }

  public String getMeAPen(int cost){
    if(cost>=10)
      return "Pen";
    else
      return "Nothing";
  }
}

public class Demo {
  public static void main(String a[]){

  Calculator com=new Calculator();
    com.playMusic();
    String value=com.getMeAPen(10);
    System.out.println(value);
  }
}
