package com.capgemini.retailer_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailer_db.dto.Product;

@Service
public class ServiceProductImpl implements ServiceProduct{

	@Autowired
	private ServiceProduct dao;
	@Override
	public boolean addProduct(Product bean) {
		// TODO Auto-generated method stub
		return dao.addProduct(bean);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(id);
	}

	@Override
	public List<Product> getProduct(int id) {
		// TODO Auto-generated method stub
		return dao.getProduct(id);
	}


}
