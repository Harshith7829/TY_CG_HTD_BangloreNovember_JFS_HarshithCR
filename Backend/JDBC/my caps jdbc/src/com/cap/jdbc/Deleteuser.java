package com.cap.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Deleteuser {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt= null;
		
		
		
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
			
			//Issue SQL query via connection
			String query ="DELETE from users_info where userid=? and password=?";
			pstmt= conn.prepareStatement(query);
			System.out.println("Enter userid");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password");
			pstmt.setString(2, sc.nextLine());
			
			int count= pstmt.executeUpdate();
			if(count>0) {
				System.out.println("user deleted....");
			}else {
				System.err.println("Something went wrong");
			}
			
			//Process the Result returned
			//close all JDBC objects
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
