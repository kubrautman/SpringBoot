package com.kubrautman.SpringBootSample.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kubrautman.SpringBootSample.Dao.ProductDao;
import com.kubrautman.SpringBootSample.Entities.ProductLines;
import com.kubrautman.SpringBootSample.Entities.Products;
import com.kubrautman.SpringBootSample.Service.ProductService;

@Service
public class ProductServiceImpl  implements ProductService{

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<Products> getAllProduct() {
		return productDao.getAllProduct();
	}

	@Override
	public void addProduct(Products products) {
		productDao.addProduct(products);
		
	}

	@Override
	public void updateProduct(String productCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(String productCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductLines> getProductLines() {
		return productDao.getProductLines();
	}

	@Override
	public List<Products> retrieveProductsByProductLine(String productLine) {
		// TODO Auto-generated method stub
		return productDao.retrieveProductsByProductLine(productLine);
	}

}
