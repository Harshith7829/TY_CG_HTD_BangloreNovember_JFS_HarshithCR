package com.capgemini.typecasting.pkg1;

public class Primitive {
	
	byte b=4;
	  short s=b;
	  
	  int i=b;
	  
	  long l=b;
	  
	  float f=b;
	  double d=b;
	  
	  
	  void values() {
		  System.out.println("byte"+b);
		  System.out.println("short"+s);
		  System.out.println("int"+i);
		  System.out.println("long"+l);
		  System.out.println("double"+d);
		  System.out.println("float"+f);
	  }
	  
	  double e=3.142;
	  int y= (int)e ;
	  
	  void details() {
		  System.out.println("double"+e);
		  System.out.println("int"+y);
	  }

}
