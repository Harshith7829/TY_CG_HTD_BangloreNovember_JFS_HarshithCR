package com.capgemini.retailer_db.dto;

import java.util.List;

import lombok.Data;
@Data
public class UserResponse {

	private int statusCode;
	private String messesge;
	private  String discription;
	private User bean;
	private List<User> beans; 
}
