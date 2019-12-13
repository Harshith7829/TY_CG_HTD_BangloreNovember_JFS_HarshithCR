package com.cap.phone.factory;

import com.cap.phone.dao.Dao;
import com.cap.phone.dao.DaoImpl;

public class Factory {
	
	public static Dao FactoryDaoImpl() {
		return new DaoImpl();
	}

}
