package com.manikanta.repo;

import com.manikanta.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICustomer extends MongoRepository<Customer,String> {
}
