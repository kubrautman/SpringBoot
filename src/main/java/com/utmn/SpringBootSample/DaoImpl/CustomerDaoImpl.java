package com.utmn.SpringBootSample.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.utmn.SpringBootSample.Dao.CustomerDao;
import com.utmn.SpringBootSample.Entities.Customers;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	private EntityManager entityManager;

	 public CustomerDaoImpl(EntityManager entityManager) {
		 this.entityManager = entityManager;
	}
    
	
	@Transactional
	@Override
	public List<Customers> getCustomerList() {
		Session session = entityManager.unwrap(Session.class);
		List<Customers> customerList = session.createQuery("from Customers", Customers.class).getResultList();
		return customerList;
	}

}
