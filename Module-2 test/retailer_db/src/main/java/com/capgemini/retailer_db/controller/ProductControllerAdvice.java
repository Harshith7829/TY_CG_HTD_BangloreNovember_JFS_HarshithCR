package com.capgemini.retailer_db.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailer_db.dto.OrderResponse;
import com.capgemini.retailer_db.dto.ProductResponse;
import com.capgemini.retailer_db.exception.OrderException;
import com.capgemini.retailer_db.exception.ProductException;

@RestControllerAdvice
public class ProductControllerAdvice {
	@ExceptionHandler(ProductException.class)
	public ProductResponse handleProductException(ProductException e) {
		ProductResponse response = new ProductResponse();
		response.setStatusCode(501);
		response.setMessesge("Exception");
		response.setDiscription(e.getMessage());
		return response;
	}
}
