package com.capgemini.accessspecifier.pkg1;

public class Student {
	
	protected String StudName;
	
	protected Student(String n){
		
		StudName=n;
	}
	
	protected void studDetails() {
		
		System.out.println("stud name is "+StudName);
	}

}
