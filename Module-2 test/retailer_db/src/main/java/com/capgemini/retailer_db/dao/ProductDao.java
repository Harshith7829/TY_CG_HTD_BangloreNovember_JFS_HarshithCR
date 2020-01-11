package com.capgemini.retailer_db.dao;

import java.util.List;

import com.capgemini.retailer_db.dto.Product;
import com.capgemini.retailer_db.dto.User;

public interface ProductDao {

	public boolean addProduct(Product bean);
	
	public List<Product> getAllProducts();
	
	public boolean deleteProduct(int id);
	
	public List<Product> getProduct(int id);
	
}
