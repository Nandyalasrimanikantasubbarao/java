package com.manikanta.sevice;

import com.manikanta.dao.StudentRepo;
import com.manikanta.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService{
    private StudentRepo repo;

    @Autowired
    public void setRepo(StudentRepo repo){
        this.repo=repo;
    }

    @Override
    public String registerNewStudent(Student student) {
        Student stu=repo.save(student);

        return "New Student registered successfully with id"+stu.getId();
    }

    @Override
    public List<Student> getAlltheValues() {
        return repo.findAll();

    }

    @Override
    public Optional<Student> getValueById(Integer id) {
        return repo.findById(id);

    }

    @Override
    public String deleteById(Integer id) {
        Optional<Student> opt=repo.findById(id);
        if(opt.isEmpty()){
            return "Record not present in database with id "+id;
        }else{

            repo.deleteById(id);
            return "Record deleted with id "+id;
        }
    }
}
