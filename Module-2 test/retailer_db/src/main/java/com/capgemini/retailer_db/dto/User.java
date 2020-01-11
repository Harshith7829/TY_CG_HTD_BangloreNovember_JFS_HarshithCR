package com.capgemini.retailer_db.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="user_info")
public class User {

	@Id
	@Column(name="user_id")
	@GeneratedValue
	private int userid;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_password")
	private String password;
	
	@Column (name="user_email",unique = true, nullable = false)
	private String email;
	
	@OneToOne(cascade= CascadeType.ALL ,mappedBy="userId")
	private Product  productId;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="orderid")
	private List<Order> orders;
}
