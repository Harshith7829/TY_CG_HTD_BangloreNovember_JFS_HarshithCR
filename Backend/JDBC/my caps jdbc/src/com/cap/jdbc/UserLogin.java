package com.cap.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Connection conn=null;
		//Statement stmt=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		
		try {
			//load the driver
			Driver driver= new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded..........");
			
			//Get DBConnection via Driver
			String dburl= "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			
			System.out.println("Enter username");
			String dbuser=sc.nextLine();
			System.out.println("Enter password");
			String dbpass=sc.nextLine();
			conn=DriverManager.getConnection(dburl,dbuser,dbpass);
			System.out.println("connection established.....");
			
			//Issue SQL query via connection
			
			
//			String query ="SELECT * FROM users_info where userid=20000 and password=3456";
//			stmt= conn.createStatement();
//			rs=stmt.executeQuery(query);
//			System.out.println("query issued and executed");
//			
			String query= "SELECT * FROM users_info WHERE userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			
			System.out.println("Enter userid");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password");
			pstmt.setString(2, sc.nextLine());
			rs=pstmt.executeQuery();
			
			System.out.println("***********************************************");
			
			//Process the Result returned
			if(rs.next()) {
				System.out.println("userid : "+rs.getInt(1));
				System.out.println("username : "+rs.getString(2));
				System.out.println("email : "+rs.getString(3));
				System.out.println("password :"+rs.getString(4));
			}
			else {
				System.err.println("Wrong userid and password");
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
				if(pstmt!=null) 
					pstmt.close();
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
