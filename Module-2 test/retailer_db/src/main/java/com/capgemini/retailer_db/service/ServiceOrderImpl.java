package com.capgemini.retailer_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailer_db.dto.Order;
@Service
public class ServiceOrderImpl implements ServiceOrder {

	@Autowired
	private ServiceOrder dao;
	@Override
	public boolean addOrder(Order bean) {
		// TODO Auto-generated method stub
		return dao.addOrder(bean);
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return dao.getAllOrders();
	}

	@Override
	public boolean deleteOrder(int id) {
		// TODO Auto-generated method stub
		return dao.deleteOrder(id);
	}

	@Override
	public List<Order> getOrder(int id) {
		// TODO Auto-generated method stub
		return dao.getOrder(id);
	}

}
