package Assingmnt;

import java.util.ArrayList;
import java.util.Iterator;

public class A049_Arraylist_itrator {
	
	public static void main(String[] args) {
		
		ArrayList<String> st=new ArrayList<String>();
		st.add("IND");
		st.add("USA");
		st.add("UK");
		st.add("PAK");
		
		System.out.println("Country : ");
		
		Iterator<String> itr=st.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
				
				
		
		
	}

}
