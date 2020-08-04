package com.bsrutmn.SpringBootSample.Dao;

import java.util.List;

import com.bsrutmn.SpringBootSample.Entities.Products;

public interface ProductDao {
	List<Products> getAllProduct();
	
	void addProduct();
	
	void updateProduct(String productCode);
	
	void deleteProduct(String productCode);
}
