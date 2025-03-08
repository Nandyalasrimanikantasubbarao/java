class Human{
  private String name;
  private int age;

  // constructor
  public Human(){
    age=18;
    name="manikanta";
  }

  public Human(int age,String name){
    this.age=age;
    this.name=name;
  }
  
  public void setName(String name){
    this.name=name;
  }

  public String getName(){
    return this.name;
  }

  public void setAge(int age){
    this.age=age;
  }
  public int getAge(){
    return this.age;
  }

}
class Demo{
  public static void main(String[] args) {
    // Human obj=new Human();
    Human obj=new Human(20,"mani");
    // obj.setName("mani");
    // obj.setAge(19);
    System.out.println(obj.getName()+" : "+obj.getAge());
  }
}