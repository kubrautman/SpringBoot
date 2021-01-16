package com.kubrautman.SpringBootSample.Service;

import java.util.List;

import com.kubrautman.SpringBootSample.Entities.Customers;

public interface CustomerService {

	List<Customers> getCustomerList();
	
	Customers doGetCustomerById(Integer customerNumber);
	
	List<Customers> retriveCustomerByCustomerName(String customerName);
}
