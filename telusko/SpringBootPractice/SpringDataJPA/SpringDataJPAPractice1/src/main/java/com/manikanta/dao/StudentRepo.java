package com.manikanta.dao;

import com.manikanta.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student,Integer> {
}
