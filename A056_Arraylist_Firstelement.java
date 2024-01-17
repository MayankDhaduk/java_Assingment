package Assingmnt;

import java.util.ArrayList;

public class A056_Arraylist_Firstelement {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> sg =new ArrayList<String>();
		sg.add("Apple");
		sg.add("Banana");
		sg.add("Mango");
		sg.add("Guava");
		sg.add("Kiwi");
		
		System.out.println("Fruits name : "+sg);
		
		System.out.println(sg.getFirst());
		
		System.out.println(sg.getLast());
		
		
		
	}

}
