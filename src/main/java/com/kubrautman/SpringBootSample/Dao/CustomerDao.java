package com.kubrautman.SpringBootSample.Dao;

import java.util.List;

import com.kubrautman.SpringBootSample.Entities.Customers;

public interface CustomerDao {
 List<Customers> getCustomerList();
 Customers doGetCustomerById(Integer customerNumber);
 List<Customers> retriveCustomerByCustomerName(String customerName);
}
