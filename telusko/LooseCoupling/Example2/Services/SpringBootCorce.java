package Services;
import Services.Icources;

public class SpringBootCorce implements Icources{

  public Boolean getTheCource(Double amount){
    System.out.println("SpringCource  Corce purchased and the price paid is "+amount);
    return true;

  }
  
}
