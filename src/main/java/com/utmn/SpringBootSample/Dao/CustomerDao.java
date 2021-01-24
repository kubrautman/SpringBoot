package com.utmn.SpringBootSample.Dao;

import java.util.List;

import com.utmn.SpringBootSample.Entities.Customers;

public interface CustomerDao {
 List<Customers> getCustomerList();
}
