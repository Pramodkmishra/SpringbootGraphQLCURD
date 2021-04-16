package com.login.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.login.demo.model.Customer;
import com.login.demo.mongoRepository.CustomerRepository;

public class CustomerServiceImplement implements CustomerService{
	private Map<String, Customer> map = new HashMap<>();
	@Autowired
	CustomerRepository custrepo;
    
	@Override
	public Customer createCustomerRecord(Customer customer) {
		if(null !=customer) {
			System.out.println("kkkkk");
			  map.put(customer.getEmail(), customer);
	          
			custrepo.save(customer);
		}
		System.out.println("pppppppp");
		return customer;
	}
	@Override
	public Customer getCustomerDetailById(String email) {
		 return null != email? map.get(email) : null;
	}

}
