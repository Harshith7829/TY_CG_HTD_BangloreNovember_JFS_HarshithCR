package com.cap.flipcart.factory;

import com.cap.flipcart.dao.Dao;
import com.cap.flipcart.dao.DaoImpl;

public class FlipCartFactory {

	
	public static Dao factoryFlip() {
		
		Dao dao= new DaoImpl();
		return dao;
	}
}
