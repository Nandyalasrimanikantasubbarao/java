package Services;

public class FedEx implements Delivary {
    
    @Override
    public Boolean delivarProduct(Double amount) {
        System.out.println("Product delivered through FedEx and amount paid is " + amount);
        return true;
    }
}
