import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    int [][] marks=new int[3][4];
    Scanner sc=new Scanner(System.in);

    for(int i=0;i<marks.length;i++){
      for(int j=0;j<marks[i].length;j++){
        System.out.println("Kindly ENter the marks of class "+i+" student "+j);
        marks[i][j]=sc.nextInt();
      }
    }

    for(int j=0;j<marks.length;j++){
      for(int i=0;i<marks[j].length;i++){
        System.out.print(marks[j][i]+" , ");
      }
      System.out.println();
    }
  }
}
