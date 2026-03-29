package com.manikanta.service;

import com.manikanta.dto.CustomerDTO;
import com.manikanta.model.Customer;

import java.util.List;

public interface ICustomerService {
    public String registerCustomer(CustomerDTO dto);
    public List<Customer> findALlCustomer();
    public String removeDoecument(String id);
}
