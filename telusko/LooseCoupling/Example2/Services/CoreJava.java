import Services.Icources;
public class CoreJava implements Icources{
  public Boolean getTheCource(Double amount){
    System.out.println("CoreJava Corce purchased and the price paid is "+amount);
    return true;
  }
}
