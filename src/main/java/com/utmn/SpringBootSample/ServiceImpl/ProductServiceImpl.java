package com.utmn.SpringBootSample.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utmn.SpringBootSample.Dao.ProductDao;
import com.utmn.SpringBootSample.Entities.ProductLines;
import com.utmn.SpringBootSample.Entities.Products;
import com.utmn.SpringBootSample.Service.ProductService;

@Service
public class ProductServiceImpl  implements ProductService{

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<Products> getAllProduct() {
		return productDao.getAllProduct();
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

	@Override
	public List<ProductLines> getProductLines() {
		return productDao.getProductLines();
	}

}
