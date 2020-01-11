package com.capgemini.retailer_db.service;

import java.util.List;

import com.capgemini.retailer_db.dto.Order;

public interface ServiceOrder {

public boolean addOrder(Order bean);
	
	public List<Order> getAllOrders();
	
	public boolean deleteOrder(int id);
	
	public List<Order> getOrder(int id);
}
