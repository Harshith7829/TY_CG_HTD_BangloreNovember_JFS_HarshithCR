package com.caps.jdbc.controller;

import java.util.List;

import com.caps.jdbc.bean.UserBean;
import com.caps.jdbc.factory.UserFactory;
import com.caps.jdbc.services.UserServices;

public class GetAllUsers {
	
	public static void main(String[] args) {
		
		UserServices services= UserFactory.instanceOfUserServices();
		
		List<UserBean> List= services.getAllUsers();
		
		if(List!=null) {
			for (UserBean user : List) {
				System.out.println(user);
			}
		}
	}

}
