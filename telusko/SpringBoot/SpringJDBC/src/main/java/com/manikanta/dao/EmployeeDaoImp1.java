package com.manikanta.dao;

import com.manikanta.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository("dao")
public class EmployeeDaoImp1 implements IEmployeeDao{

    @Autowired
    private DataSource dataSource;
    private String SQL_QUERY="SELECT * FROM Employee";

    List<Employee> employees=null;

    @Override
    public List<Employee> getEmployeeInfo(){
        try{
//            registering driver
            Connection connection=dataSource.getConnection();

            PreparedStatement pstmnt=connection.prepareStatement(SQL_QUERY);

            ResultSet rs=pstmnt.executeQuery();

            employees=new ArrayList<>();

            while (rs.next()){
                Employee emp=new Employee();
//                Integer i=rs.getInt(1);
//                emp.setId(i);
//
//                String name=rs.getString(2);
//                emp.setName(name);

                emp.setId(rs.getInt(1));
                emp.setName(rs.getString(2));
                emp.setCity(rs.getString(3));

                employees.add(emp);

            }

//            establishing connection
        }catch(Exception e){
            e.printStackTrace();
        }


        return employees;
    }
}
