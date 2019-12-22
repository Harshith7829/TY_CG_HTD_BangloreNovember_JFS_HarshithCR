package com.cap.flipcart.dao;

import java.util.List;

import com.cap.flipcart.beans.FlipBean;

public interface Dao {

	public List<FlipBean>  showAll();
	
	public List<FlipBean> searchProd(String name);
	
	public void buy(long l1 , int cvv);

	
	
}
