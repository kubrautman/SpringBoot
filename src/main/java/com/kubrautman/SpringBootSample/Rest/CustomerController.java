package com.kubrautman.SpringBootSample.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kubrautman.SpringBootSample.Entities.Customers;
import com.kubrautman.SpringBootSample.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/all")
	private List<Customers> getAllCustomer() {
		return customerService.getCustomerList();
	}
	
	@RequestMapping(value = "/id", method = RequestMethod.GET)
	public Customers getCustomerByCustomerId(@RequestParam("customerId") Integer customerId) {
	
		return customerService.doGetCustomerById(customerId);
	}
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public List<Customers> retriveCustomerByCustomerName(@RequestParam("customerName") String customerName){
		return customerService.retriveCustomerByCustomerName(customerName);
	}
}
