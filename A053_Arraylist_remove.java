package Assingmnt;

import java.util.ArrayList;

public class A053_Arraylist_remove {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> st=new ArrayList<String>();
		
		st.add("Hello");
		st.add("World");
		st.add("Hello");
		st.add("Java");
		
		System.out.println("This is : "+st);
		
		st.remove(3);
		
		for(String s : st)
		{
			System.out.println(s);
		}
		
		
		
		
	}

}
