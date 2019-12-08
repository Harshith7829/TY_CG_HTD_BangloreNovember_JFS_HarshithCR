package com.capgemini.accessspecifier.pkg1;

public class Person {
	
	public static int age;
	
	
	public Person(int age) {
		this.age=age;
		
	}
	
	public static void details() {
		System.out.println("age is"+age);
	}

}
