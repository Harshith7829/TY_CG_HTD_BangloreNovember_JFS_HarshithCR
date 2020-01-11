package com.capgemini.retailer_db.dao;

import java.util.List;

import com.capgemini.retailer_db.dto.User;

public interface UserDao {

	
	public User auth(String email , String pass);
	
	public boolean register(User bean);
	
	public List<User> getAllUsers();
	
	public boolean changeUserPassword(int id , String pass );
	
	public boolean deleteUser(int id);
	
	public List<User> getUser(int id);
}
