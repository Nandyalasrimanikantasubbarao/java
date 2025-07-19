
import com.example.componentscan.AppConfig;
import com.example.componentscan.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee =(Employee) context.getBean("employee");
        System.out.println(employee.toString());
    }
}

