package com.kubrautman.SpringBootSample.Dao;

import java.util.List;

import com.kubrautman.SpringBootSample.Entities.ProductLines;
import com.kubrautman.SpringBootSample.Entities.Products;

public interface ProductDao {
	List<Products> getAllProduct();
	
	void addProduct();
	
	void updateProduct(String productCode);
	
	void deleteProduct(String productCode);
	
	List<ProductLines> getProductLines();
	
	List<Products> getProductByLine(String productLine);
	
	List<Products> retrieveProductsByProductLine(String productLine);

	void addProduct(Products products);
}
