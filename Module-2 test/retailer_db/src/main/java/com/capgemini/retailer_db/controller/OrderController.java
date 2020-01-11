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

import com.capgemini.retailer_db.dto.Order;
import com.capgemini.retailer_db.dto.OrderResponse;
import com.capgemini.retailer_db.dto.User;
import com.capgemini.retailer_db.dto.UserResponse;
import com.capgemini.retailer_db.service.ServiceOrder;
import com.capgemini.retailer_db.service.ServiceUser;
@RestController
public class OrderController {

	@Autowired
	private ServiceOrder service;
	
	@PostMapping(path="/add-order",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes= MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse  register(@RequestBody Order bean) {
		OrderResponse response= new OrderResponse();
		if(service.addOrder(bean)) {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Ordered");
		}else {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("Out of stock");	
		}
		return response;
	}
	
	@GetMapping(path="/getall-orders",produces=MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse searchUser(@RequestParam(name="key")String key) {
		OrderResponse response= new OrderResponse();
		List<Order> beans = service.getAllOrders();
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("Orders Not Found");	
			
		}else {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Order Details Found");
			response.setBeans(beans);
		}
		return response;
	}
	
	@DeleteMapping(path="/deleteorder/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse deleteUser(@PathVariable("id")int id) {
		OrderResponse response= new OrderResponse();
		service.deleteOrder(id);
		response.setStatusCode(201);
		response.setMessesge("success");
		response.setDiscription("Order Deleted");	
		return response;
	}
	
	@GetMapping(path="/get-order/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse getCustomerDetails(@PathVariable("id")int key) {
		OrderResponse response= new OrderResponse();
		List<Order> beans = service.getOrder(key);
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("No order found");	
			
		}else {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Order Details Found");
			response.setBeans(beans);
		}
		return response;
	}
}
