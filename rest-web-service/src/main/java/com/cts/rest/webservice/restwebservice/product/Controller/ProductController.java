package com.cts.rest.webservice.restwebservice.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cts.rest.webservice.restwebservice.product.Product;

import com.cts.rest.webservice.restwebservice.product.dao.ProductDaoService;

@RestController
public class ProductController {
	
  @Autowired
  private ProductDaoService productDaoService;
  
  //get mapping for the retriving the products
  
  @GetMapping(path="/products")
	List<Product> getallProducts() {
		return productDaoService.getAllProducts();
	}
	
  @GetMapping(path="/product/{id}")
  public Product getProductById(@PathVariable int id) {
	 return  productDaoService.getProductById(id);
	  
  }
  
  @PostMapping("/product")
  public void addProduct(@RequestBody Product product) {
	  
	 productDaoService.addProduct(product);
  }
	
  @DeleteMapping(path="/product/delete/{id}")
  public Product deleteProductById(@PathVariable int id) {
	 return  productDaoService.deleteProductById(id);
	  
  }
  // commint new changes in controller
  
	
}
