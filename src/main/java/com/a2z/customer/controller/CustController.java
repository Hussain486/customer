package com.a2z.customer.controller;


import com.a2z.customer.model.Customer;
import com.a2z.customer.service.ServiceOrchestrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/a2z/")
public class CustController {


    @Autowired
    ServiceOrchestrator serviceOrchestrator;
    @PostMapping(path = "cust/createCust/", consumes = "application/json", produces = "application/json")
    public List<Customer> createCustomer(@RequestBody Customer customer) {
        serviceOrchestrator.process(customer);

            return serviceOrchestrator.fetchCustData();

    }

}
