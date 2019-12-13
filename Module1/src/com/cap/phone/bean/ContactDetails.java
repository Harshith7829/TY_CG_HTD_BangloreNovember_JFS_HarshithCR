package com.cap.phone.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class ContactDetails  implements Serializable{
	
	private String name;
	private Long number;
	private String group;
	

}
