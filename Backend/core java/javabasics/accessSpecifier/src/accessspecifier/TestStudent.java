package com.capgemini.acessspecifier.pkg2;

import com.capgemini.accessspecifier.pkg1.Student;

public class TestStudent extends Student {

	protected TestStudent(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	
	protected void studentDetails() {
		System.out.println("student name is  "+StudName);
	}
	
	public static void main(String[] args) {
		
		TestStudent t1 = new TestStudent("john");
		t1.studDetails();
		t1.studentDetails();
	}
	
	

}
