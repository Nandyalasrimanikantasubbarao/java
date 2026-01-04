import java.lang.annotation.*;
// import java.lang.annotation.ElementType;
// import java.lang.annotation.Retention;
// import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR})
@interface CricketPlayer
{
  String country() default "India";
  int age() default 34;
}//@ this specifies compiler that annotation type is being created
// information about this class

@CricketPlayer(country = "India",age = 35)
class ViratKohli
{
  private int innings;
  public ViratKohli(){

  }

  public int getInnings(){
    return innings;
  }

  public void setInnigs(int innings){
    this.innings=innings;
  }


}
public class Demo {
  public static void main(String[] args) {
    ViratKohli vk=new ViratKohli();
    vk.setInnigs(344);

    Class<? extends ViratKohli> c=vk.getClass();
    Annotation an=c.getAnnotation(CricketPlayer.class);
    CricketPlayer cp=(CricketPlayer) an;
    int age=cp.age();
    String co=cp.country();
    System.out.println("Info of attributes of annotations are "+age+" "+co);
  }
  
}
