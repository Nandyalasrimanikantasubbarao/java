import java.util.Scanner;

public class Demo {
  public static void main(String[] args){
    int[] marks=new int[5];

    //// entering data
    // marks[0]=14;
    // marks[1]=13;
    // marks[2]=12;
    // marks[3]=11;
    // marks[4]=10;

    Scanner sc=new Scanner(System.in);

    
    for(int i=0;i<marks.length;i++){
      System.out.println("Kindly Enter the marks of student "+(i+1));
      marks[i]=sc.nextInt();
    }

    for(int i:marks){
      System.out.print(i);
    }


  }
  
}
