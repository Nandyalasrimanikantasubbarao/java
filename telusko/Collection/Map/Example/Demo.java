import java.util.*;;
class Passport{
  private String name;
  private String city;
  private String country;

  public Passport(String name,String city,String country){
    this.name=name;
    this.city=city;
    this.country=country;
  }

  public void setName(String name){
    this.name=name;
  }

  public String getName(){
    return name;
  }
  
  public void setCity(String city){
    this.city=city;
  }

  public String getCity(){
    return city;
  }

  public void setCountry(String country){
    this.country=country;
  }

  public String getCountry(){
    return country;
  }

  @Override
  public String toString(){
    return "Passport [name="+name+", city"+city+", country"+country+"]";
  }
}
public class Demo {
  public static void main(String[] args) {
    Passport pass1=new Passport("Mani","Hyderabad","India");
    Passport pass2=new Passport("Ravi","Bengaluru","India");
    Passport pass3=new Passport("Rani"," Vizag","India");

    Integer id1=Integer.valueOf(101);
    Integer id2=Integer.valueOf(201);
    Integer id3=Integer.valueOf(301);

    HashMap<Integer, Passport> hm=new HashMap<>();
    hm.put(id1,pass1);
    hm.put(id2,pass2);
    hm.put(id3,pass3);

    System.out.print(hm);

    Scanner sc=new Scanner(System.in);
    System.out.println("Kindly enter your passport number");
    Integer userNum=sc.nextInt();

    Set entry=hm.entrySet();
    Boolean flag=false;
    Iterator itr=entry.iterator();

    while(itr.hasNext()){
      Map.Entry keyValue=(Map.Entry) itr.next();
      Integer key=(Integer) keyValue.getKey();

      System.out.println(userNum.getClass());
      System.out.println(key.getClass());
      
      if(userNum.equals(key)){
        System.out.println(userNum);
        System.out.println(key);
        System.out.println("Please find your passport details below");
        System.out.println(keyValue.getValue());
        flag=true;
      }
    }
    if(flag==false){
      System.out.println("Unable to fetch your information bassed on password id given");
    }
  }
  
}
