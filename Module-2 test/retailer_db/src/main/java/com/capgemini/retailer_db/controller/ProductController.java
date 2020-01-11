package com.capgemini.retailer_db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailer_db.dto.Product;
import com.capgemini.retailer_db.dto.ProductResponse;
import com.capgemini.retailer_db.dto.User;
import com.capgemini.retailer_db.dto.UserResponse;
import com.capgemini.retailer_db.service.ServiceProduct;
@RestController
public class ProductController {
	
	@Autowired
	private ServiceProduct service;


	@PostMapping(path="/add-product",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes= MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse product(@RequestBody Product bean) {
		ProductResponse response= new ProductResponse();
		if(service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("SuccessFully added");
		}else {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription(" Product ID already exists");	
		}
		return response;
	}
	
	@GetMapping(path="/getall-products",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse searchAllProducts(@RequestParam(name="key")String key) {
		ProductResponse response= new ProductResponse();
		List<Product> beans = service.getAllProducts();
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription(" No products Found");	
			
		}else {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("products not Found");
			response.setBeans(beans);
		}
		return response;
	}
	
	@DeleteMapping(path="/deleteproduct/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteproduct(@PathVariable("id")int id) {
		ProductResponse response= new ProductResponse();
		service.deleteProduct(id);
		response.setStatusCode(201);
		response.setMessesge("success");
		response.setDiscription("Product Deleted");	
		return response;
	}
	
	@GetMapping(path="/get-product/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProduct(@PathVariable("id")int key) {
		ProductResponse response= new ProductResponse();
		List<Product> beans = service.getProduct(key);
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("No such Product found");	
			
		}else {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Product Details Found");
			response.setBeans(beans);
		}
		return response;
	}
}
