import java.util.*;

class Employee{
  private Integer id;
  private String name;
  private String city;

  public Employee(Integer id,String name,String city){
    super();
    this.id=id;
    this.name=name;
    this.city=city;
  }

  public String toString() {
      return "Employee{id=" + id + ", name='" + name + "', city='" + city + "'}";
  }
}
public class Demo {

  public static void main(String[] args) {
    

    ArrayList<Employee> employee=new ArrayList<>();
    employee.add(new Employee(1,"Manikanta","Vizag"));
    employee.add(new Employee(1,"Ravi","Amaravati"));
    employee.add(new Employee(1,"Rohit","Mumbai"));

    for(Employee e:employee){
      System.out.println(e);
    }    

    System.out.println(employee.get(0).toString());
    
    //typesafty
    int ar[]=new int[3];
    ar[0]=14;
    ar[1]=24;
    ar[2]=30;
    


    ArrayList al=new ArrayList();
    al.add("Teluko");
    al.add("Java");

    //typesafety
    ArrayList<String> list=new ArrayList<>();
    list.add("Java");
    list.add("springboot");
    list.add("Microservices");

    
    
  }
}
