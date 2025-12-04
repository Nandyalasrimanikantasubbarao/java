import java.util.*;

class UnderAge extends Exception{
  public UnderAge(String msg){
    super(msg);

  }
}

class OverAge extends Exception{
  public OverAge(String msg){
    super(msg);

  }
}
class Applicant{
  int age;
  public void input(){
    Scanner sc=new Scanner(System.in);
    System.out.println("kindly enetr your age");
    age=sc.nextInt();
  }
  public void verify() throws OverAge,UnderAge{
    if(age>=18 && age <=60){
      System.out.println("Proceed with License Application");
    }else if(age<18){
      throw new UnderAge("Have patience kiddo! you still have time");
      
      }else{
        throw new OverAge("Your time is near have Rest at home");

    }
  }
}

class Rto{
  public void initite(){
    Applicant app=new Applicant();
    try{

      app.input();
      app.verify();
    }catch(UnderAge | OverAge e){
      System.out.println(e.getMessage());
    }
  }
}
public class Demo {
  public static void main(String[] args) {
    Rto r=new Rto();
    r.initite();


  }
  
}
