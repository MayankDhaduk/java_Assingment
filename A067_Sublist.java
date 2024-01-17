package Assingmnt;

import java.util.ArrayList;

public class A067_Sublist {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Apple");
		ar.add("Banana");
		ar.add("Mango");
		ar.add("Kiwi");
		ar.add("Pineapple");
		
		System.out.println(ar.subList(1, 3));
	}

}
