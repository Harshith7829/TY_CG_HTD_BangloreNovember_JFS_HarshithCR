package com.cap.phone.controller;

import java.util.Scanner;

import com.cap.phone.bean.ContactDetails;
import com.cap.phone.dao.Dao;
import com.cap.phone.factory.Factory;

public class App {

	public static void main(String[] args) {
		
		Dao dao=Factory.FactoryDaoImpl();
		
		while(true) {
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Select 1 to List of Contacts");
			System.out.println("Select 2 to search Contacts");
			System.out.println("Select 3 to Add Contacts");
			System.out.println("Select 4 to Edit Contacts");
			
			int choice = sc.nextInt();
			switch(choice) {
				
			case 1 :  dao.listOfContacts();
			break;
				
			case 2:		System.out.println("Enter Name");
						String name= sc.next();
						dao.search(name);
				break;
			
			case 3:	ContactDetails det = new ContactDetails();	
				System.out.println("Enter name");
			   			String nam= sc.next();
			   			det.setName(nam);
			   	System.out.println("Enter Number");
			   			Long lon = sc.nextLong();
			   			det.setNumber(lon);
			   	System.out.println("Enter group");
			   	String grp= sc.next();
			   	det.setGroup(grp);
			   	
				dao.addContact(det);
			break;
			case 4: dao.modifyContact()
			}
			
			
			
		}//while
		
	}//method
}//class
