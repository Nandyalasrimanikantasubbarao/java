class Learn{
  private int id;
  private String name;
  private String city; 

  void setId(int newId){
    id=newId;
  }

  void setName(String newName){
    name=newName;
  }

  void setCity(String newCity){
    city=newCity;
  }

  int getId() {
    return id;
  }

  String getName(){
    return name;
  }

  String getCity() {
    return city;
  }

}
public class Learner {
  public static void main(String[] args) {
    Learn l=new Learn();
    l.setId(1);
    l.setName("Mani");
    l.setCity("Hydrabad");

    System.out.println(l.getId());
    System.out.println(l.getName());
    System.out.println(l.getCity());
  }
}
