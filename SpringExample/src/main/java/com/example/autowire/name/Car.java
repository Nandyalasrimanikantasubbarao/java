package com.example.autowire.name;

import com.example.autowire.name.Specification;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details: "+specification);
    }

}
