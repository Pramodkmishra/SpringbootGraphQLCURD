package com.login.demo.resolver;


import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.login.demo.model.Customer;
import com.login.demo.mongoRepository.CustomerRepository;
import com.login.demo.service.CustomerService;
@Component
class CustomerMutationResover  implements GraphQLMutationResolver{
	
	private CustomerService customerService;
	private CustomerRepository custrepo;
	public Customer createCustomer(Customer customer)
	{
		//customer=new Customer("Ravi","Mishra","Ravi@gmail.com","M","Lucknow","India","ABCD","AVCD");
		custrepo.save(customer);
		return customerService.createCustomerRecord(customer);
	}

}
