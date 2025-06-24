package com.firstproject.firstwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstproject.firstwebapplication.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
  
}
