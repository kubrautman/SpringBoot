package com.kubrautman.SpringBootSample.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kubrautman.SpringBootSample.Dao.CustomerDao;
import com.kubrautman.SpringBootSample.Entities.Customers;
import com.kubrautman.SpringBootSample.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao  customerDao;

	@Override
	public List<Customers> getCustomerList() {
		return  customerDao.getCustomerList();
	}



	@Override
	public List<Customers> retriveCustomerByCustomerName(String customerName) {
		return customerDao.retriveCustomerByCustomerName(customerName);
	}



	@Override
	public Customers doGetCustomerById(Integer customerNumber) {
		// TODO Auto-generated method stub
		return customerDao.doGetCustomerById(customerNumber);
	}
	
	

}
