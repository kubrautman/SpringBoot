package com.bsrutmn.SpringBootSample.Dao;

import java.util.List;

import com.bsrutmn.SpringBootSample.Entities.Customers;

public interface CustomerDao {
 List<Customers> getCustomerList();
}
