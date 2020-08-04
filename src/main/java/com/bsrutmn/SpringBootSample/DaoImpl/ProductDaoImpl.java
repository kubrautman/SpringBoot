package com.bsrutmn.SpringBootSample.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.bsrutmn.SpringBootSample.Dao.ProductDao;
import com.bsrutmn.SpringBootSample.Entities.Products;

@Repository
public class ProductDaoImpl implements ProductDao {

	private EntityManager entityManager;
	
	public ProductDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Products> getAllProduct() {
		Session session = entityManager.unwrap(Session.class);
		List<Products> products = session.createQuery("from Products", Products.class).getResultList();
		return products;
	}

	@Override
	public void addProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(String productCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(String productCode) {
		// TODO Auto-generated method stub
		
	}

}
