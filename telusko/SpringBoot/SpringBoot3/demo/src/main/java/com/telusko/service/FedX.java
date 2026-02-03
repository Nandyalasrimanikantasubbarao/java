package com.telusko.service;

import org.springframework.stereotype.Service;

@Service
public class FedX implements IDelivery{
    @Override
    public Boolean deliveryTheProduct(Double amount) {
        System.out.println("Product Delivered with FedEx and Amount paid is "+amount);
        return true;
    }
}
