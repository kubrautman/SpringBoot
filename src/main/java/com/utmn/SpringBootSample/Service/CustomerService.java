package com.utmn.SpringBootSample.Service;

import java.util.List;

import com.utmn.SpringBootSample.Entities.Customers;

public interface CustomerService {

	List<Customers> getCustomerList();
}
