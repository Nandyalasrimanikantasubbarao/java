package com.manikanta.sevice;

import com.manikanta.entity.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    public String registerNewStudent(Student student);
    public List<Student> getAlltheValues();
    public Optional<Student> getValueById(Integer id);
    public String deleteById(Integer id);
}
