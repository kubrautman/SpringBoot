package com.kubrautman.SpringBootSample.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.kubrautman.SpringBootSample.Dao.CustomerDao;
import com.kubrautman.SpringBootSample.Entities.Customers;

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


	@Override
	public Customers doGetCustomerById(Integer customerNumber) {
		//TypedQuery with JPA
		Session session = entityManager.unwrap(Session.class);
		TypedQuery<Customers> queryCustomers = session.createQuery("from Customers s where s.customerNumber = :customerNumber",Customers.class);
		Customers customers = queryCustomers.setParameter("customerNumber", customerNumber).getSingleResult();
		
		return customers;
	}


	@Override
	public List<Customers> retriveCustomerByCustomerName(String customerName) {
		Session session = entityManager.unwrap(Session.class);
		TypedQuery<Customers> queryCustomers = session.createQuery("from Customers s where s.customerName = :customerName",Customers.class);
		List<Customers>  customerList = queryCustomers.setParameter("customerName", customerName).getResultList();
		
		return customerList;
	}

}
