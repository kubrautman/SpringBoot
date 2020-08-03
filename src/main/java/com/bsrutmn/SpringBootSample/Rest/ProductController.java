package com.bsrutmn.SpringBootSample.Rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
 public  String get() {
	 return "Laptop";
 }
	 
	 @RequestMapping(value = "/products", method = RequestMethod.GET)
 public  String getProducts() {
	 return "Laptop2";
 }
	 
	 @RequestMapping(value = "/customer", method = RequestMethod.GET)
 public  String getCustomer() {
	 return "customer";
 }
	
}
