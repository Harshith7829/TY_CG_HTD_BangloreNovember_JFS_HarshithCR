package com.cap.flipcart.beans;

import java.io.Serializable;

import lombok.Data;
@Data
public class FlipBean implements Serializable{

	private int productid;
	private String name;
	private int cost; 
	private String color;
	private String description;
	private int numofprod;
}
