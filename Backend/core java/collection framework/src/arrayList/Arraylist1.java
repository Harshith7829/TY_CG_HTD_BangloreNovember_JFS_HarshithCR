package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1= new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println(a1);
		System.out.println("-------------for loop-------------");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("----------------for each loop-------------------");
		
		for (Integer i1 : a1) {
			System.out.println(i1);
		}
		
		System.out.println("-----------------iterator-----------------");
		
		Iterator<Integer> itr= a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------list iterTOR");
		
		ListIterator<Integer> itr1= a1.listIterator();///wthout giving a1.size
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());}
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.add(60);
		a2.add(70);
		a2.add(80);
		
		System.out.println(a2);
		a2.remove(new Integer(80));
		System.out.println(a2);
	}

	}
