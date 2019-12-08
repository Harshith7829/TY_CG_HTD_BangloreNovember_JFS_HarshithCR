package com.caps.jdbc.services;

import java.util.List;

import com.caps.jdbc.bean.UserBean;
import com.caps.jdbc.dao.UserDAO;
import com.caps.jdbc.factory.UserFactory;

import lombok.Data;

public class UserServicesImpl implements UserServices{
	UserDAO dao= UserFactory.instanceOfUserDAOimpl();
	@Override
	public List<UserBean> getAllUsers() {
		
		return dao.getAllUsers();
	}

	@Override
	public UserBean userLogin(String username, String password) {
		
		return dao.userLogin( username, password);
	}

	@Override
	public boolean updateUser(int userid, String password, String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(int userid, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertUser(UserBean user) {
		
		return dao.insertUser(user);
	}

	
	

}
