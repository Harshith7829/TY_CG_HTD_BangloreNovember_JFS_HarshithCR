package com.caps.datastruc.algorithm;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {
	
	
	public static void main(String[] args) {
		long number =99999999L;
		System.out.println(addUpto(number));
		System.out.println(addUptoQuick(number));
		coutingDuration1();
		coutingDuration2();
		
	}

	public static long addUpto(Long number) {
		Long total=0L;
		
		for(int i=0; i<= number;i++) {
			total= total+i;
		}
		return total;
	}
	
	
	public static long addUptoQuick(Long number) {
		return number * (number+1)/2;
	}
	
	public static void coutingDuration1() {
		long number =-9665443399999L;                                                                 
		Instant start = Instant.now();  
		System.out.println("addUpto  "+addUpto(number));
		Instant end = Instant.now();
		long duration= Duration.between(start, end).toMillis();
		double seconds = duration/1000.0;
		System.out.println("addUpto  time "+seconds+ " seconds");
	}
	
	public static void coutingDuration2() {
		long number =-99999999L;                                                                 
		Instant start = Instant.now();  
		System.out.println("addUpto  "+addUptoQuick(number));
		Instant end = Instant.now();
		long duration= Duration.between(start, end).toMillis();
		double seconds = duration/1000.0;
		System.out.println("addUpto  time "+seconds+ " seconds");
	}
}
