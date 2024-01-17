package Assingmnt;

import java.util.ArrayList;
import java.util.Iterator;

public class A051_Retrive_name {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> st=new ArrayList<String>();
		st.add("Mayank");
		st.add("Janak");
		st.add("Sahil");
		st.add("Dixit");
		st.add("Arun");
		
		System.out.println("Name : "+st);
		
		Iterator<String> itr=st.iterator();
		
		System.out.println(st.get(0));
		
		
	}

}
