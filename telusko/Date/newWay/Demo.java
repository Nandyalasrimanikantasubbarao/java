import java.time.LocalDate;
import java.time.LocalTime;

public class Demo {
  public static void main(String[] args) {
    LocalDate date=LocalDate.now();
    System.out.println(date);
    System.out.println(date.getDayOfMonth());
    System.out.println(date.getMonthValue());
    System.out.println(date.getYear());
    System.out.println(date.getMonth());

    LocalTime dob=LocalTime.now();
    System.out.println(dob);

  }
  
}
