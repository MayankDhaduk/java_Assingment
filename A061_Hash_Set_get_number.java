package Assingmnt;

import java.util.HashSet;
import java.util.Iterator;

public class A061_Hash_Set_get_number {
	
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		
		int count=0;
		Iterator<String> itr=hs.iterator();
		while (itr.hasNext()) 
		{
			
			System.out.println(itr.next());
			count++;
			
		}
		
		System.out.println("Total element : "+count);
	
		
		
		
		
		
	}

}
