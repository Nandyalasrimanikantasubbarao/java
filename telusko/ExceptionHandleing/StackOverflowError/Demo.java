class Alpha{
  public void alpha(){
    beta();
  }

  public void beta(){
    alpha();
  }
}
public class Demo {

  public static void main(String[] args) {
    Alpha a=new Alpha();
    a.alpha();
  }
}
