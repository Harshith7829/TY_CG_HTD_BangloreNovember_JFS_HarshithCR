package com.capgemini.retailer_db.dto;

import java.util.List;

import lombok.Data;
@Data
public class ProductResponse {

	private int statusCode;
	private String messesge;
	private  String discription;
	private List<Product> beans;
}
