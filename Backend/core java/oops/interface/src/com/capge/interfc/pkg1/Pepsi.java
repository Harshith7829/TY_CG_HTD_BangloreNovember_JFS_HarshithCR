

package com.capge.interfc.pkg1;

public class Pepsi implements Bottle{
	
	public void open() {
		System.out.println("bottle opened");
	}
	
	public void drink() {
		System.out.println("drink juice");
	}
	 @Override
	public void juice() {
		System.out.println("drink juice pepsi ");
	}

}
