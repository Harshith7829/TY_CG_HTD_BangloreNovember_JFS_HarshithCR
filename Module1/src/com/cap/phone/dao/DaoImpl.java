package com.cap.phone.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.cap.phone.bean.ContactDetails;
import com.cap.phone.controller.App;
import com.sun.xml.internal.ws.api.pipe.NextAction;

public class DaoImpl implements Dao{

	Scanner sc = new Scanner(System.in);
	FileReader reader;
	Properties prop;
	ContactDetails det;
	List<ContactDetails> list;
	public DaoImpl() {
		try {
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("dbdriver"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void listOfContacts() {
		List<ContactDetails> list = new ArrayList<ContactDetails>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"), prop.getProperty("dbpass"));
				Statement stmt = conn.createStatement();
				ResultSet rs=	stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()){
				det=new ContactDetails(); 
				//				ContactDetails det= new ContactDetails();
				det.setName(rs.getString(1));
				list.add(det);
			}
			if(list !=null) {
				for(ContactDetails d1: list) {
					System.out.println(d1);}}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}


	@Override
	public void search(String name) {
		
		while(true) {
		System.out.println("press 1 to make a call");
		System.out.println("press 2 to message ");
		System.out.println("press 3 to back");
		int choice= sc.nextInt();
		
		switch (choice) {
		case 1:  System.out.println("Calling to......... " + name);
			break;
		case 2: 	System.out.println("tap here to Type");
					String type= sc.next();
					ArrayList<String> a1 = new ArrayList<String>();
					a1.add(type);
					System.out.println("Message Sent Successfully");
					break;
		case 3: 	App.main(null);
		break;
		default:	
		break;
		}}
//		List<ContactDetails> list = new ArrayList<ContactDetails>();
//		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"), prop.getProperty("dbpass"));
//				Statement stmt = conn.createStatement();
//				ResultSet rs=	stmt.executeQuery(prop.getProperty("query1"))){
		
//		if(list.contains(name)) {
//			System.out.println("Press 1 to make call");
//			System.out.println("Press 2 to Send Message");
//			int choice= sc.nextInt();
//			switch(choice) {
//			case 1:  System.out.println("calling");
//			break;
//			case 2: System.out.println("Tap here to Write");
//			break;
//			}
//		}
//			while(rs.next()) {
//				det= new ContactDetails();
//				det.setName(rs.getString(1));
//				list.add(det) ;
//				
//				}
//			System.out.println(list);
//			if(list.contains(name)) {
//				System.out.println("Calling"+name);
//			}else {
//				System.out.println("Contact not found");
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}

	}

	@Override
	public void addContact(ContactDetails details) {

		try {
			Connection conn=  DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"), prop.getProperty("dbpass"));
			PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insert1"));	

			pstmt.setString(1, details.getName());
			pstmt.setLong(2, details.getNumber());
			pstmt.setString(3, details.getGroup());

			int i=pstmt.executeUpdate();
			if(i==1) {
				System.out.println("Contact Added");;
			}else {
				System.out.println("Not added");;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void   modifyContact(Long lg , String name  , String grp) {
		
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"), prop.getProperty("dbpass"));
						PreparedStatement pstmt= conn.prepareStatement(prop.getProperty("modify"))){
						
				
				pstmt.setLong(1, lg);
				pstmt.setString(2, name);
				pstmt.setString(2, grp);
				
				int i=pstmt.executeUpdate();
				if(i==1) {
					System.out.println("SucccessFul");;
				}else {
					System.out.println("Failed");;
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public boolean operation() {
		// TODO Auto-generated method stub
		return false;
	}




}
