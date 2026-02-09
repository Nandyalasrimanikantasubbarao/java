package com.manikanta.model;


public class Employee {
    private Integer id;
    private  String name;
    private  Integer getId;

    public Employee(Integer id,String name,Integer getId) {
        this.id = id;
        this.name=name;
        this.getId=getId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGetId() {
        return getId;
    }

    public void setGetId(Integer getId) {
        this.getId = getId;
    }
}
