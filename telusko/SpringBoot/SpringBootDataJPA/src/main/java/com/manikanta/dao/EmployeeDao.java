package com.manikanta.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private String sql="INSERT INTO EMPLOYEE(id,name,city)VALUES(1,'Rohan','Bengaluru')";

    public void input(){
        jdbcTemplate.update(sql);
        System.out.println("Data Inserted");
    }

}
