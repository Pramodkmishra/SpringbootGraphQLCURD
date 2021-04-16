package com.login.demo.mongoRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.login.demo.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,String> {

}
