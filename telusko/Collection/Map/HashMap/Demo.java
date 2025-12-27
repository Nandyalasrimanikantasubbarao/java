import java.util.*;

class Telusko{
  private Integer id;
  private String courseName;
  

  public Telusko(Integer id, String courseName) {
    this.id = id;
    this.courseName = courseName;
  }

  public Telusko(){
    super();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

}
public class Demo {
  public static void main(String[] args) 
  {
    // HashMap<Integer,String> hm=new HashMap<>();
    // hm.put(1,"Java");
    // hm.put(2,"SpringBoot");
    // hm.put(3,"Microservices");

    // System.err.println(hm);

    // Telusko ts=new Telusko(1,"Java");
    // HashMap hm2=new HashMap();

    // hm2.put("Alien","Java");
    // hm2.put("telusko","SpringBoot");
    // hm2.put(4,"Microservices");
    // System.out.println(hm2);

    HashMap<Integer , String> hm2=new HashMap();
    hm2.put(1,"Java");
    hm2.put(2,"SpringBoot");
    hm2.put(3,"Junit5");

    System.out.println(hm2);
  }
}
