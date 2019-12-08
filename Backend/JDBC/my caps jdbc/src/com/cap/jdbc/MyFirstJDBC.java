package com.cap.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MyFirstJDBC {

	public static void main(String[] args) {
		 Connection conn=null;
		 Statement stmt=null;
		 ResultSet rs=null;
		 
		 
		try {
			//Load the Driver
			Driver driver=new com.mysql.jdbc.Driver();
			System.out.println(driver);
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded....");
			
			//Get DBConnection via Driver
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("connection established...");
			
			//Issue SQL query via connection
			String query= "SELECT * FROM users_info";
			stmt= conn.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("query issued...");
			
			//Process the Result returned
			while(rs.next()) {
				System.out.println("userid : "+rs.getInt("userid"));
				System.out.println("username : "+rs.getString("username"));
				System.out.println("email : "+rs.getString("email"));
				System.out.println("password :"+rs.getString("password"));
				System.out.println("*********************");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			//close all JDBC objects
			try {
			if(conn!=null) 
				conn.close();
			System.out.println("conn object closed");
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(stmt!=null) 
					stmt.close();
				System.out.println("stmt object closed");
				}catch(SQLException e) {
					e.printStackTrace();
				}
			try {
				if(rs!=null) 
					rs.close();
				System.out.println("rs stmt closed");
				}catch(SQLException e) {
					e.printStackTrace();
				}
			
		}
		

	}

}
