package Main.Services;

public class Java  implements  ICourse{
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Java course is purchased and Fee is paid id "+amount);
        return true;
    }
}
