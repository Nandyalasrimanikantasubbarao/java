import java.util.*;

class JaggedArray{
  public static void main(String[] args) {
    int [][] marks=new int[3][];

    // providing length in here
    marks[0]=new int[4];
    marks[1]=new int[2];
    marks[2]=new int[3];
  
    // Scanner sc=new Scannee(System.in);
    Scanner sc =new Scanner(System.in);

    for(int i=0;i<marks.length;i++){
      for(int j=0;j<marks[i].length;j++){
        System.out.println("Kindly ENter the marks of class "+i+" student "+j);
        marks[i][j]=sc.nextInt();
      }
    }

    for(int j=0;j<marks.length;j++){
      for(int i=0;i<marks[j].length;i++){
        System.out.print(marks[j][i]+" ");
      }
      System.out.println();
    }

    

  }
}