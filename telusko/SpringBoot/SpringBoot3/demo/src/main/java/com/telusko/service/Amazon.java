package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Amazon
{

//    @Autowired
    private IDelivery service;

    public Amazon(IDelivery service){
        this.service=service;
        System.out.println("Amazon Bean created");
    }

    public Boolean deliverProduct(Double amount){
        return service.deliveryTheProduct(amount);
    }

}
