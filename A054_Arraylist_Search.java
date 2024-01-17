package Assingmnt;

import java.util.ArrayList;

public class A054_Arraylist_Search {
	
	public static void main(String[] args) {
		
		ArrayList<String> st=new ArrayList<String>();
		
		
		st.add("Hello");
		st.add("World");
		st.add("Hello");
		st.add("Java");
		
		System.out.println("Is : "+st);
		
		st.get(1);
		
		System.out.println(st.get(0));
		
		for(String s : st)
		{
			System.out.println(s);
		}
		
		
		
	}

}
