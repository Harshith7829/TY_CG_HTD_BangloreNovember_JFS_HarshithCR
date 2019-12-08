package com.cap.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert1 {
	
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	try {
		//load the driver
		Driver driver= new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver loaded.............");
		
		//Get DBConnection via Driver
		String dburl= "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		
		System.out.println("Enter username");
		String dbuser=sc.nextLine();
		System.out.println("Enter password");
		String dbpass=sc.nextLine();
		conn=DriverManager.getConnection(dburl,dbuser,dbpass);
		System.out.println("connection established.....");
		
		String query= "Insert into users_info values(? ,?,?,?)";
		pstmt= conn.prepareStatement(query);
		System.out.println("Enter userid");
		pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
		System.out.println("enter username");
		pstmt.setString(2, sc.nextLine());
		System.out.println("enter email");
		pstmt.setString(3, sc.nextLine());
		System.out.println("Enter password");
		pstmt.setString(4, sc.nextLine());
		
		int count = pstmt.executeUpdate();
		
		if(count>0) {
			System.out.println("value imserted");
		}else {
			System.out.println("smthn went wrong");
		}

		}
		catch (SQLException e) {
		e.printStackTrace();
	}
}	
}