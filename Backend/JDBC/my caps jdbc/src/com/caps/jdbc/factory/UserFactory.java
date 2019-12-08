package com.caps.jdbc.factory;

import com.caps.jdbc.dao.UserDAO;
import com.caps.jdbc.dao.UserDAOimpl;
import com.caps.jdbc.services.UserServices;
import com.caps.jdbc.services.UserServicesImpl;

public class UserFactory {
	
	private UserFactory() {
		
	}
	
	public  static UserDAO instanceOfUserDAOimpl() {
		UserDAO dao= new UserDAOimpl();
		return dao;
	}
	
	public static UserServices instanceOfUserServices(){
		UserServices services= new UserServicesImpl();
		return services;
	}

}
