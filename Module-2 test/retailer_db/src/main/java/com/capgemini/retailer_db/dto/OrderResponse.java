package com.capgemini.retailer_db.dto;

import java.util.List;

import lombok.Data;
@Data
public class OrderResponse {

	private int statusCode;
	private String messesge;
	private  String discription;
	private List<Order> beans;
}
