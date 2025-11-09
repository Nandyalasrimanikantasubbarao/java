class Student{
  String name;
  int id;

  void studying(){
    System.out.println("Student is Studying");
  }

  void playing(){
    System.out.println("Student is playing");
  }

}
public class Fundamentaals {
  
  public static void main(String[] args){

    Student st=new Student();

    st.studying();
  }
  
}
