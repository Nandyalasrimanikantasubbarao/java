package Services;

public class BlueDart implements Delivary{
  
  @Override
  public Boolean delivarProduct(Double amount){
    System.out.println("product delivered through BlueDart and amount paid is "+amount);
    return true;
  }
  
}
