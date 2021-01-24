package com.utmn.SpringBootSample.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utmn.SpringBootSample.Entities.Customers;
import com.utmn.SpringBootSample.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/all")
	private List<Customers> getAllCustomer() {
		return customerService.getCustomerList();
	}
	

}
