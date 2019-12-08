package datastructures;

public class BubbleSort {

	
	public void bubbleSort(int[] a1) {
		
		int temp=0;
		for(int i=0; i<a1.length-1;i++) {
				for(int j=0;j<a1.length-i-1;j++) {
					if(a1[j]>a1[j+1]) {
				
					 temp= a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;}
				}
				
		}
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]);
		}
		
		System.out.println();
	}
}
