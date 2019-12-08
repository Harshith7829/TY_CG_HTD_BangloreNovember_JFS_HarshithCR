package com.caps.jdbc.services;

import java.util.List;

import com.caps.jdbc.bean.UserBean;

public interface UserServices {

	public List<UserBean> getAllUsers();
	
	//get all user
	public UserBean userLogin(String username, String password) ;

	//Update 
	public boolean  updateUser(int userid, String password, String email);

	//Delete
	public boolean  deleteUser(int userid, String password);

	//Insert
	public boolean insertUser(UserBean user);



}
