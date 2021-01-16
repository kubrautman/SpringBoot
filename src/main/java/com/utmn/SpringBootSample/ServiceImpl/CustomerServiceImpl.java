package com.bsrutmn.SpringBootSample.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsrutmn.SpringBootSample.Dao.CustomerDao;
import com.bsrutmn.SpringBootSample.Entities.Customers;
import com.bsrutmn.SpringBootSample.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao  customerDao;

	@Override
	public List<Customers> getCustomerList() {
		return  customerDao.getCustomerList();
	}
	
	

}
