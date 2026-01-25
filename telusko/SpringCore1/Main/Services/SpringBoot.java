package Main.Services;

public class SpringBoot implements  ICourse{
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Spring boot course is purchased and Fee is paid id "+amount);
        return true;
    }
}
