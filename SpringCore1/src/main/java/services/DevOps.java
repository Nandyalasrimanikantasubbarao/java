package services;

public class DevOps implements ICourse{
    public DevOps(){
        System.out.println("DevOps Bean created");
    }
    @Override
    public Boolean getTheCourse(Double amount){
        System.out.println("DevOps Course purchased and the prices is "+amount);
        return true;
    }
}
