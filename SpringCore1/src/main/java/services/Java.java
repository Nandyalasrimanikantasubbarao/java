package services;

public class Java implements ICourse
{

    public  Java(){
        System.out.println("Java Bean created");
    }

    @Override
    public Boolean getTheCourse(Double amount){
        System.out.println("Java Course purchased and the prices is "+amount);
        return true;
    }
}
