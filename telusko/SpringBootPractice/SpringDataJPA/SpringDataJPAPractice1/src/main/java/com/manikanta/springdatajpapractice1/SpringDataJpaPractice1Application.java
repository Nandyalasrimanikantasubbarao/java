package com.manikanta;

import com.manikanta.entity.Student;
import com.manikanta.sevice.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaPractice1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container= SpringApplication.run(SpringDataJpaPractice1Application.class, args);
        StudentService service=container.getBean(StudentService.class);

//        String val=service.registerNewStudent(new Student("Manikanta","Srimaninandyala@gmail.com",21));
//        String val1=service.registerNewStudent(new Student("Ravi","Ravi@gmail.com",22));
//        System.out.println(val);
//        System.out.println(val1);
//
//        service.getAlltheValues().forEach(v-> System.out.println(v));
//        Integer id=2;
//        Optional<Student> student=service.getValueById(id);
//        if(student.isPresent()){
//            System.out.println(student.get());
//        }else{
//            System.out.println("There is no record found with id"+ id);
//        }
        String val=service.deleteById(2);
        System.out.println(val);

    }

}
