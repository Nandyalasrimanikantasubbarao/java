package car.example.been;

public class MyBean {
    private String message;


    public void setMessage(String message){
        this.message=message;
    }

    public void showMessaage(){
        System.out.println("message"+message);
    }

    @Override
    public String toString(){
        return "MyBean{"+"message="+message+"}";
    }
}
