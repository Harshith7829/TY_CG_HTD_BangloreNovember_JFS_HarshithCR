package datastructures;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TestSort {

	public static void main(String[] args) {
		long total =0;
		Scanner sc= new Scanner(System.in);
		
		BubbleSort b1 = new BubbleSort();
		System.out.println("Enter the number of Elements to SORT");
		int[] a1= new int[sc.nextInt()];
		
		System.out.println("Enter the Elements to  Sort");
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		Instant start = Instant.now(); 
		b1.bubbleSort(a1);
//		int[] m1= new int[sc.nextInt()];
		Instant end = Instant.now();
		long duration= Duration.between(start, end).toMillis();
		double seconds = duration/1000.0;
		System.out.println("addUpto  time "+seconds+ " seconds");
		
		
		
	}

}
