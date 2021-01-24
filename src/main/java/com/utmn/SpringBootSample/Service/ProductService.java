package com.utmn.SpringBootSample.Service;

import java.util.List;

import com.utmn.SpringBootSample.Entities.ProductLines;
import com.utmn.SpringBootSample.Entities.Products;

public interface ProductService {

	List<Products> getAllProduct();
	
	void addProduct();
	
	void updateProduct(String productCode);
	
	void deleteProduct(String productCode);
	
	List<ProductLines> getProductLines();
}
