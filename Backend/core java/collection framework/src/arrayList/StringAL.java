package arrayList;

import java.util.List;
import java.util.ArrayList;

public class StringAL {
	public static void main(String[] args) {
		
		ArrayList<String> s1= new ArrayList<String>();
		
		s1.add("hhhh");
		s1.add("iiii");
		s1.add("kkkk");
		s1.add("ssss");
		
		System.out.println(s1.size());
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.contains("kkkk"));
		
		s1.remove("sss");
		System.out.println(s1);
		
		
		ArrayList<String> s2= new ArrayList<String>();
		
		s2.add("ggg");
		s2.add("qqqq");
		s2.add("xxxxx");
		s2.add("nnnn");
		
		s2.addAll(s1);
		System.out.println(s2);
		
		s2.retainAll(s1);
		System.out.println("retained--------------"+s2);
		
		
		s2.removeAll(s2);
		System.out.println(s2);
		
		
		
		System.out.println(s2.contains(s1));
		
		
		
		s2.clear();
		System.out.println(s2);
		
		System.out.println("--------------------list-----------------------");
		
		ArrayList<String> s3= new ArrayList<String>();
		
		s3.add(0, "uuuu" );
		s3.add(1, "yyyy" );
		s3.add(2, "nnnn" );
		s3.add(3, "bbbb" );
		s3.add(3, "nnnn" );
		System.out.println(s3);
		s3.remove(3);
		System.out.println(s3);
		
		System.out.println(s3.indexOf("yyyy"));
		
		System.out.println(s3.lastIndexOf("nnnn"));
		
		for (int i = 0; i < s3.size(); i++) {
			System.out.println(s3.get(i));
		}
		
		ArrayList<String> s4= new ArrayList<String>();
		
		s3.add(0, "afgh" );
		s3.add(1, "shjj" );
		s3.add(2, "ncjx" );
		s3.add(3, "bshsj" );
		s3.add(3, "lsjdh" );
		
		s2.addAll(s3);
		System.out.println(s2);
		
		s3.set(3, "moniiii");
		System.out.println(s3.get(3));
		
		System.out.println(s3);
		
		List a2= s3.subList(0, 3);
		System.out.println(a2);
		
		
		
		
		
		
		
		
		
		
	}

}
