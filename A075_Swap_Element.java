package Assingmnt;

import java.util.ArrayList;
import java.util.Collections;

public class A075_Swap_Element {
	
	public static void main(String[] args) {
		
		ArrayList<String> art =new ArrayList<String>();
		art.add("Apple");
		art.add("Banana");
		art.add("Mango");
		art.add("Kiwi");
		art.add("Pineapple");
		
		System.out.println(art);
		
		Collections.swap(art, 2, 4);
		
		System.out.println(art);
		
		
		
	}

}
