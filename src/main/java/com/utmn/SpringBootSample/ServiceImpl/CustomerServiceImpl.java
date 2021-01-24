package com.utmn.SpringBootSample.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utmn.SpringBootSample.Dao.CustomerDao;
import com.utmn.SpringBootSample.Entities.Customers;
import com.utmn.SpringBootSample.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao  customerDao;

	@Override
	public List<Customers> getCustomerList() {
		return  customerDao.getCustomerList();
	}
	
	

}
