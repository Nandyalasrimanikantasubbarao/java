import java.util.Date;

public class Demo {
  // Date -->util,sql
  // new version Java version 8->jodaApi
  public static void main(String[] args) {
    // Date date=new Date();//Date class of util class return both time and date
    // int year=date.getYear();
    // System.out.println(year);
    // System.out.println(date.getTime());

    long timeInMs=1766762868697L;
    Date date=new Date(timeInMs);
    System.out.println(date);

  }
  
}
