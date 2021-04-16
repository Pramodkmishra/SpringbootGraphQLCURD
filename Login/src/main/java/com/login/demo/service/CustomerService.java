package com.login.demo.service;

import com.login.demo.model.Customer;

public interface CustomerService {
	public Customer createCustomerRecord(Customer customer);
	public Customer getCustomerDetailById(String email);

}
