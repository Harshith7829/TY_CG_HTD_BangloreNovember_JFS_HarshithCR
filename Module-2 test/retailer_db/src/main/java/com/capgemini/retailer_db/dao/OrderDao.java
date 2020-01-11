package com.capgemini.retailer_db.dao;

import java.util.List;

import com.capgemini.retailer_db.dto.Order;

public interface OrderDao {

	public boolean addOrder(Order bean);
	
	public List<Order> getAllOrders();
	
	public boolean deleteOrder(int id);
	
	public List<Order> getOrder(int id);
	
}
