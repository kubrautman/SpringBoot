package com.bsrutmn.SpringBootSample.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bsrutmn.SpringBootSample.Entities.*;
import com.bsrutmn.SpringBootSample.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired 
	ProductService productService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get() {
		return "Laptop";
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Products> getProducts() {
		return productService.getAllProduct();
	}
	
	@RequestMapping(value = "/productLines", method = RequestMethod.GET)
	public List<ProductLines> getProductLines() {
		return productService.getProductLines();
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomer() {
		return "customer";
	}

}
