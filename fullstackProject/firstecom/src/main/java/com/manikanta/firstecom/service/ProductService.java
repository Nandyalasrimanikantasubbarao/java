package com.manikanta.firstecom.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.manikanta.firstecom.Repo.ProductRepo;
import com.manikanta.firstecom.model.Product;

@Service
public class ProductService {

  @Autowired
  private ProductRepo repo;

  public  List<Product> getAllProducts(){
    return repo.findAll();
  }

  public Product geProductById(int id){
    return repo.findById(id).orElse(new Product());
  }

  public Product addProduct(Product product,MultipartFile imageFile) throws IOException{
    product.setImageName(imageFile.getOriginalFilename());
    product.setImageType(imageFile.getContentType());
    product.setImageData(imageFile.getBytes());

    return repo.save(product);

  }

}
