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
@Table(name="order_info")
public class Order {

	@Id
	@Column(name="order_id")
	@GeneratedValue
	private int orderid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userid")
	private  User userId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="productid")
	private  User productid;
}
