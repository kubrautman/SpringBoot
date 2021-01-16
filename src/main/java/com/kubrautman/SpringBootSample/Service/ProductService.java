package com.kubrautman.SpringBootSample.Service;

import java.util.List;

import com.kubrautman.SpringBootSample.Entities.ProductLines;
import com.kubrautman.SpringBootSample.Entities.Products;

public interface ProductService {

	List<Products> getAllProduct();
	
	void addProduct(Products products);
	
	void updateProduct(String productCode);
	
	void deleteProduct(String productCode);
	
	List<ProductLines> getProductLines();
	
	List<Products> retrieveProductsByProductLine(String productLine);

	
}
