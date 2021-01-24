package com.utmn.SpringBootSample.Dao;

import java.util.List;

import com.utmn.SpringBootSample.Entities.*;

public interface ProductDao {
	List<Products> getAllProduct();
	
	void addProduct();
	
	void updateProduct(String productCode);
	
	void deleteProduct(String productCode);
	
	List<ProductLines> getProductLines();
	
	List<Products> getProductByLine(String productLine);
	
}
