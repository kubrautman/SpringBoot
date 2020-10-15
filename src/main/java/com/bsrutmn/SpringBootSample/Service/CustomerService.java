package com.bsrutmn.SpringBootSample.Service;

import java.util.List;

import com.bsrutmn.SpringBootSample.Entities.Customers;

public interface CustomerService {

	List<Customers> getCustomerList();
}
