package com.capgemini.retailer_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailer_db.dao.UserDao;
import com.capgemini.retailer_db.dto.User;
@Service
public class ServiceUserImpl implements ServiceUser {
	@Autowired
	private UserDao dao;

	@Override
	public User auth(String email, String pass) {
		// TODO Auto-generated method stub
		return dao.auth(email, pass);
	}

	@Override
	public boolean register(User bean) {
		// TODO Auto-generated method stub
		return dao.register(bean);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public boolean changeUserPassword(int id, String pass) {
		// TODO Auto-generated method stub
		return dao.changeUserPassword(id, pass);
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return dao.deleteUser(id);
	}

	@Override
	public List<User> getUser(int id) {
		// TODO Auto-generated method stub
		return dao.getUser(id);
	}
	
	
}
