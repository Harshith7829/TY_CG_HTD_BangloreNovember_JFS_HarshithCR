package com.capgemini.retailer_db.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailer_db.dto.OrderResponse;
import com.capgemini.retailer_db.exception.OrderException;
@RestControllerAdvice
public class OrderControllerAdvice {

	@ExceptionHandler(OrderException.class)
	public OrderResponse handleOrderException(OrderException e) {
		OrderResponse response = new OrderResponse();
		response.setStatusCode(501);
		response.setMessesge("Exception");
		response.setDiscription(e.getMessage());
		return response;
	}
}
