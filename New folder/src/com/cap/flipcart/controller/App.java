package com.cap.flipcart.controller;

import java.util.List;
import java.util.Scanner;

import com.cap.flipcart.beans.FlipBean;
import com.cap.flipcart.dao.Dao;
import com.cap.flipcart.factory.FlipCartFactory;

public class App {

	public static void main(String[] args) {
		
		Dao dao= FlipCartFactory.factoryFlip();
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("Press 1 to Show All Products");
			System.out.println("Press 2 to Search For Products");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 		List<FlipBean> list= dao.showAll();
							for (FlipBean flipBean : list) {
								System.out.println(flipBean);
							}
			break;
			
			case 2 : 		System.out.println("Enter Product Name");
			 				String name= sc.next();
			 				List<FlipBean> bean=dao.searchProd(name);
			 				for (FlipBean flipBean : bean) {
								System.out.println(flipBean);
							}
			 				System.out.println("Press 1 to buy");
			 				System.out.println("press 2 to Search Again");
			 				System.out.println("Press 3 to GoTo HOME");
			 					int ch= sc.nextInt();
			 					
			 					switch(ch) {
			 					
			 					case 1 :  System.out.println("Enter 16 digit Card Number");
			 								long l1= sc.nextLong();
			 								System.out.println("Enter 3 Digit Cvv");
			 								int cvv = sc.nextInt();
			 						dao.buy(l1, cvv);
			 						break;
			 					case 2 : 		System.out.println("Enter Product Name");
				 						String name1= sc.next();
				 							List<FlipBean> bean1=dao.searchProd(name1);
				 							for (FlipBean flipBean : bean1) {
				 								System.out.println(flipBean);
				 							}
				 							break;
			 					case 3 : 		App.main(null);
			 					break;
			 					}
			 				break;
			 default :		System.out.println("Enter Correct Input");				
			 break;		
				
			
			}
		}
	}//method
}//class
