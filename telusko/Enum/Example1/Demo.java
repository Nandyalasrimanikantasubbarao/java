enum Result{
  PASS,FAIL;

  // by default behid the seens enums values works like this
  // public static final Result PASS=new Result();

  int marks;
  Result(){
    System.out.println("Constructor of enum");
  }

  public void setMarks(int marks){
    this.marks=marks;
  }

  public int getMarks(){
    return marks;
  }
}
public class Demo {
  public static void main(String[] args) {
    Result result=Result.PASS;
    result.setMarks(44);
    System.out.println(result.getMarks());

    Result.PASS.setMarks(44);
    int marks=Result.PASS.getMarks();
    System.out.println(marks);
  }
  
}
