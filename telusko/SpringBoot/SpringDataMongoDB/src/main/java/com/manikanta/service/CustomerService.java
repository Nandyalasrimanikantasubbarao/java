package com.manikanta.service;

import com.manikanta.dto.CustomerDTO;
import com.manikanta.model.Customer;
import com.manikanta.repo.ICustomer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{


    private ICustomer repo;

    @Autowired
    public void setRepo(ICustomer repo){
        this.repo=repo;
    }


    @Override
    public String registerCustomer(CustomerDTO dto) {
        Customer cx=new Customer();
        BeanUtils.copyProperties(dto,cx);
        Customer cxDoc=repo.save(cx);
        return "Customer Info Stored with id "+cxDoc.getId();
    }

    @Override
    public List<Customer> findALlCustomer() {
        return repo.findAll();
    }

    @Override
    public String removeDoecument(String id) {
        Optional<Customer> optional=repo.findById(id);
        if(optional.isPresent()){
            repo.deleteById(id);
            return "Customer with id "+id+" is deleted";
        }else{
            return "No Document found with given id "+id;
        }
    }
}
