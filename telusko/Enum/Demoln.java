enum Week{
  MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class Demoln {
  public static void main(String[] args){
    Week week=Week.MONDAY;
    System.out.println(week);

    int index=Week.THURSDAY.ordinal();
    System.out.println(index);

    Week[] weekArr=Week.values();

    for(Week w:weekArr){
      System.out.println(w.ordinal()+"->"+w);
    }
  }
  
}
