import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) throws IOException {
    // System.out.println("Enter a number");
    // it gives asci value
    // int num=System.in.read();

    // old why getting input from user
    // InputStreamReader in=new InputStreamReader(System.in);
    // BufferedReader bf=new BufferedReader(in);
    // int num=Integer.parseInt(bf.readLine());

    // System.out.println(num*10);
    
    // bf.close();
    
    /////// better why taking input
    // interger
    // Scanner sc=new Scanner(System.in);
    // int num=sc.nextInt();
    
    // System.out.println(num*10);

    // string
    Scanner sc=new Scanner(System.in);
    String val=sc.nextLine();

    System.out.println(val);



  }
  
}
