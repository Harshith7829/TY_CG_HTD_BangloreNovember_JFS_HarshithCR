package com.caps.jdbc.dao;

import java.util.List;

import com.caps.jdbc.bean.UserBean;

public interface UserDAO {
	
	public List<UserBean> getAllUsers();
	public UserBean userLogin(String username, String password) ;

	//Update 
	public boolean  updateUser(int userid, String password, String email);

	//Delete
	public boolean  deleteUser(int userid, String password);

	//Insert
	public boolean insertUser(UserBean user);


}
