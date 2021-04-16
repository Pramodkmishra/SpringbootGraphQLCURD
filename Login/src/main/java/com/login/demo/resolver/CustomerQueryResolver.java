package com.login.demo.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.login.demo.model.Customer;
import com.login.demo.service.CustomerService;

@Component
public class CustomerQueryResolver implements GraphQLQueryResolver {
	private CustomerService customerService;
public Customer customer(String email)
{
	return customerService.getCustomerDetailById(email);
	}
}
