package com.telusko.service;

public class Employee {

    private Integer empId;
    private String name;
    private Double salary;
    private String city;

    private Department department;


    public Employee(Integer empId, String name, Double salary, String city,Department department) {
        super();
        System.out.println("Employee Bean created");
        this.empId = empId;
        this.name=name;
        this.salary=salary;
        this.city=city;
        this.department=department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name  +
                ", salary=" + salary +
                ", city='" + city  +
                '}';
    }

    public String employeeTask(){
        return "Every Employee Acts Productive but in reality they are less productive";
    }
}
