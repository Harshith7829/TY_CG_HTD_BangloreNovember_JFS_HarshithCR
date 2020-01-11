package com.capgemini.retailer_db.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.retailer_db.dto.User;
public interface ServiceUser {

public User auth(String email , String pass);
	
	public boolean register(User bean);
	
	public List<User> getAllUsers();
	
	public boolean changeUserPassword(int id , String pass );
	
	public boolean deleteUser(int id);
	
	public List<User> getUser(int id);
}
