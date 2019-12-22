package com.cap.flipcart.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cap.flipcart.beans.FlipBean;

public class DaoImpl implements Dao{
	
	FileReader reader;
	Properties prop;
	FlipBean flip;


	public DaoImpl() {
		try {

			reader= new FileReader("db.properties");
			prop= new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("dbdriver"));
		} catch (Exception e) {

			e.printStackTrace();
		}
	}	
	@Override
	public List<FlipBean> showAll() {
		List<FlipBean> list= new ArrayList<FlipBean>();
		try(Connection  conn= DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),prop.getProperty("dbpass"));
				Statement stmt = conn.createStatement();
				ResultSet rs= stmt.executeQuery(prop.getProperty("getall"))){
			
			while(rs.next()) {
				flip= new FlipBean();
				flip.setProductid(rs.getInt(1));
				flip.setName(rs.getString(2));
				flip.setCost(rs.getInt(3));
				flip.setColor(rs.getString(4));
				flip.setDescription(rs.getString(5));
				flip.setNumofprod(rs.getInt(6));
				
				list.add(flip);
				
			}	
			return list;
			}catch(Exception e) {
				e.printStackTrace();
			}//catch
		return null;
}//method

	@Override
	public List<FlipBean> searchProd(String name) {
		List<FlipBean> list= new ArrayList<FlipBean>();
		try(Connection  conn= DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),prop.getProperty("dbpass"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("byname"))){
					
					pstmt.setString(1, name);
					
					ResultSet rs=pstmt.executeQuery();
					
					while(rs.next()) {
						flip= new FlipBean();
						flip.setProductid(rs.getInt(1));
						flip.setName(rs.getString(2));
						flip.setCost(rs.getInt(3));
						flip.setColor(rs.getString(4));
						flip.setDescription(rs.getString(5));
						flip.setNumofprod(rs.getInt(6));
						
						list.add(flip);
					}
					return list;
				}catch(Exception e) {
					e.printStackTrace();
				}
		return null;
	}
	@Override
	public void buy(long l1, int cvv) {
		
		if(l1<16 && cvv <3 ) {
			System.out.println("Please Enter Valid Id And Cvv");
		}else {
			System.out.println("Ordered SuccessFul");
		}
		
	}

}
