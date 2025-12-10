class Generics<T>{
  private T ref;

  public Generics(T ref){
    this.ref=ref;
  }

  public void disp(){
    System.out.println("The type of t is :"+ref.getClass());
  }

  public T getRef(){
    return ref;
  }
}
public class Demo {
  public static void main(String[] args) {
    Generics<Integer> g=new Generics(44);
    g.disp();
    System.out.println(g.getRef());

    Generics<String> g2=new Generics("Maniknata");
    g2.disp();
    System.out.println(g.getRef());
    
    ArrayList<?> a=new ArrayList<>();//?unknown-->wild card any type
    
  }
  
}
