package com.cap.phone.dao;

import com.cap.phone.bean.ContactDetails;

public interface Dao {
	
	public void listOfContacts();
	public void  search(String name);
	public boolean operation();
	public void addContact(ContactDetails details);
	public void   modifyContact(Long lg , String name  , String grp);

}
