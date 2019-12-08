package com.capge.interfc.pkg1;

public interface Bottle {
	
	void open();
	
	void drink();
	
	default void juice() {
		System.out.println("fanta juice");
	}
	
	static void close() {
		System.out.println("bottle closed");
	}

}
