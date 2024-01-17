package Assingmnt;

import java.util.ArrayList;

public class A052_Arraylist_update {
	
	public static void main(String[] args) {
		
		ArrayList<String> st=new ArrayList<String>();
		
		st.add("Apple");
		st.add("Mango");
		st.add("Banana");
		st.add("Guava");
		
		System.out.println("Fruit : "+st);
		
		st.set(1, "Kiwi");
		
		for(String s : st)
		{
			System.out.println(s);
		}
		
		
		
	}

}
