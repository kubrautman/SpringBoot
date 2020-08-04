package com.bsrutmn.SpringBootSample.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bsrutmn.SpringBootSample.Dao.ProductDao;
import com.bsrutmn.SpringBootSample.Entities.Products;
import com.bsrutmn.SpringBootSample.RowMappers.ProductsRowMapper;

@Repository
public class ProductDaoImpl implements ProductDao {

    private JdbcTemplate template;
	
	public ProductDaoImpl(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Products> getAllProduct() {
        return (List<Products>) template.query("SELECT * FROM Products", new ProductsRowMapper());
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
