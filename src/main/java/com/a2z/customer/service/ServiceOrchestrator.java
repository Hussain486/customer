package com.a2z.customer.service;

import com.a2z.customer.model.Customer;
import com.a2z.customer.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOrchestrator {

    @Autowired
    CustomerRepo customerRepo;
    public void process(Customer customer) {

        customerRepo.save(customer);


    }

    public List<Customer> fetchCustData(){
        return customerRepo.findAll();
    }


}
