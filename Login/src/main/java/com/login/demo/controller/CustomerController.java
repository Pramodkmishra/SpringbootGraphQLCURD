package com.login.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.login.demo.model.Customer;
import com.login.demo.mongoRepository.CustomerRepository;
@Controller
public class CustomerController {
	@Autowired
CustomerRepository custrepo;
	
	@ResponseBody
	@RequestMapping("/store")	
	
public String storeInDb()
{
	Customer cust=new Customer("Pramod","Mishra","pmd@gmail.com","M","Lucknow","India","ABCD","AVCD");
custrepo.save(cust);	
System.out.println(	cust.toString());
return cust.toString();

}
}
