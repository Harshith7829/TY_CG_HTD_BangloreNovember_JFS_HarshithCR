package com.capgemini.retailer_db.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="product_info")
public class Product {

	@Id
	@Column(name="product_id")
	@GeneratedValue
	private int productid;
	
	@Column(name="product_name",unique = true, nullable = false)
	private String productName;
	
	@Column(name="product_quantity")
	private int quantity;
	
	@Column (name="product_details")
	private String details;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userid")
	private  User user;
}
