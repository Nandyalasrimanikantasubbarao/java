class Students{
  int rollno;
  String name;
  int marks;
}
public class Demo {
  public static void main(String a[]){
    Students s1=new Students();
    s1.rollno=1;
    s1.name="Manikanta";
    s1.marks=87;

    Students s2=new Students();
    s2.rollno=2;
    s2.name="Ravi";
    s2.marks=80;

    Students s3=new Students();
    s3.rollno=3;
    s3.name="saibabu";
    s3.marks=90;

    Students students[]=new Students[3];
    students[0]=s1;
    students[1]=s2;
    students[2]=s3;

    for(Students s : students){
      System.out.println(s.name+" : "+s.marks);

    }
    

  }
  
}
