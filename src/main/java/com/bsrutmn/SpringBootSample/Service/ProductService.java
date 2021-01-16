package com.bsrutmn.SpringBootSample.Service;

import java.util.List;

import com.bsrutmn.SpringBootSample.Entities.ProductLines;
import com.bsrutmn.SpringBootSample.Entities.Products;

public interface ProductService {

	List<Products> getAllProduct();
	
	void addProduct();
	
	void updateProduct(String productCode);
	
	void deleteProduct(String productCode);
	
	List<ProductLines> getProductLines();
}