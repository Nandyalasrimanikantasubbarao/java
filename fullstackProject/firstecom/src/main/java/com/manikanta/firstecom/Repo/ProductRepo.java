package com.manikanta.firstecom.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikanta.firstecom.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
  
}
