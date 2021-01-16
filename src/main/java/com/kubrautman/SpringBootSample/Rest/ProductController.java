package com.kubrautman.SpringBootSample.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kubrautman.SpringBootSample.Entities.*;
import com.kubrautman.SpringBootSample.Service.ProductService;

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


	@RequestMapping(value = "/product", method = RequestMethod.GET)
	@ResponseBody
	public List<Products> retrieveProductsByProductLine(@RequestParam("productLine") String productLine){
		return productService.retrieveProductsByProductLine(productLine);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addProduct(@RequestBody Products products){
		
		productService.addProduct(products);
	}

}
