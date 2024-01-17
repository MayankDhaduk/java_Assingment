package Assingmnt;

import java.util.HashSet;

public class A077_Hashset_compare_retain {
	
	public static void main(String[] args) {
		
		
		HashSet<Integer> hs =new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		hs1.add(50);
		
		
		System.out.println(hs.equals(hs1)) ;
		
		HashSet<Integer> H =new HashSet<Integer>(hs);
		H.retainAll(hs1);
		
		
		
		System.out.println("Same element : "+H);
		
		
		
		
		
	}

}
