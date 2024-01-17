package Assingmnt;

import java.util.ArrayList;
import java.util.ListIterator;

public class A066_Arraylist_Reverse {
	
	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Apple");
		ar.add("Banana");
		ar.add("Mango");
		ar.add("Kiwi");
		
		ListIterator<String>itr=ar.listIterator(ar.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		
		
		
	}

}
