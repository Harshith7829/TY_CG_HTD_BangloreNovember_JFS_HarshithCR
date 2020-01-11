package com.capgemini.retailer_db.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.capgemini.retailer_db.dto.UserResponse;
import com.capgemini.retailer_db.exception.UserException;
@RestControllerAdvice
public class UserControllerAdvice {

	@ExceptionHandler(UserException.class)
	public UserResponse handleUserException(UserException e) {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setMessesge("Exception");
		response.setDiscription(e.getMessage());
		return response;
	}
}
