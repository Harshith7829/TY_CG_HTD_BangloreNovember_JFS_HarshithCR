package com.caps.jdbc.controller;

import java.util.Scanner;

import com.caps.jdbc.bean.UserBean;
import com.caps.jdbc.factory.UserFactory;
import com.caps.jdbc.services.UserServices;

public class Insertuser {
	
	public static void main(String[] args) {
		
		UserServices services= UserFactory.instanceOfUserServices();
		UserBean user = new UserBean();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter UserId.........");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter user name");
		user.setUsername(sc.nextLine());
		System.out.println("Enter Email");
		user.setEmail(sc.nextLine());
		System.out.println("Enter password");
		user.setPassword(sc.nextLine());
		
		if(services.insertUser(user)) {
			System.out.println("user inserted");
		}else {
			System.out.println("something went wrong");
			
		}
	}

}
