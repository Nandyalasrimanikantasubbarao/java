package com.manikanta.dto;

import org.springframework.data.annotation.Id;

public class CustomerDTO {

    private Integer custNo;

    private String name;

    private String city;

    public Integer getCustNo() {
        return custNo;
    }

    public void setCustNo(Integer custNo) {
        this.custNo = custNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CustomerDTO(Integer custNo, String name, String city) {
        this.custNo = custNo;
        this.name = name;
        this.city = city;
    }

    public CustomerDTO() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", custNo=" + custNo +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
