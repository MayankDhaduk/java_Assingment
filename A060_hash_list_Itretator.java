package Assingmnt;

import java.util.HashSet;
import java.util.Iterator;

public class A060_hash_list_Itretator {
	
	public static void main(String[] args) {
		
		 HashSet<String> hs=new HashSet<String>();
		 hs.add("JAVA");
		 hs.add("Python");
		 hs.add("SQL");
		 hs.add("Andriond");
		 hs.add("IOS");
		 
		 Iterator<String> itr =hs.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		
		
		
		
	}

}
