package com.a2z.customer.repository;

import com.a2z.customer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer, String> {




}
