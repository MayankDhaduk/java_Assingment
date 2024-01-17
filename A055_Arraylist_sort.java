package Assingmnt;

import java.util.ArrayList;
import java.util.Collections;

public class A055_Arraylist_sort {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> in=new ArrayList<Integer>();
		
		in.add(6);
		in.add(5);
		in.add(4);
		in.add(2);
		in.add(1);
		in.add(3);
		
		System.out.println("Number : "+in);
		
		
		
		Collections.sort(in);
		
		for(int i : in)
		{
			System.out.println(i);
		}
		
		
		
		
	}

}
