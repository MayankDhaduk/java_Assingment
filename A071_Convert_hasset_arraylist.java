package Assingmnt;

import java.util.HashSet;

public class A071_Convert_hasset_arraylist {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hi=new HashSet<Integer>();
		hi.add(10);
		hi.add(20);
		hi.add(30);
		hi.add(40);
		
		System.out.println(hi);
		
		Integer a[]=new Integer[4];
		hi.toArray(a);
		
		for(int i : a)
		{
			System.out.println(i);
		}
	
		
		
	}

}
