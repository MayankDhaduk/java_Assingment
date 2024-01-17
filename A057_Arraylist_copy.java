package Assingmnt;

import java.util.ArrayList;

public class A057_Arraylist_copy {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> i1=new ArrayList<Integer>();
		i1.add(1);
		i1.add(2);
		i1.add(3);
		i1.add(4);
		i1.add(5);
		
		System.out.println("Firest arraylist : "+i1);
		
		ArrayList<Integer> i2=new ArrayList<Integer>(i1);
		
		System.out.println("Second copy Arraylist : "+i2);
	
		
		
	}

}
