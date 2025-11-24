package Services;

public class FirstFlight implements Delivary{
  @Override
  public Boolean delivarProduct(Double amount){
    System.out.println("product delivered through FirstFlight and amount paid is "+amount);
    return true;
  }
  
}
