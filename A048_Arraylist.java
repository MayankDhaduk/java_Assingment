package Assingmnt;

import java.util.ArrayList;
import java.util.Iterator;

public class A048_Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> str=new ArrayList<String>();
		
		str.add("Red");
		str.add("Orange");
		str.add("Yellow");
		str.add("Black");
		str.add("Blue");
		
	
		System.out.println("List of color");
		
		for(String color : str)
		{
			
			System.out.println(color);
			
		}
		
	}
	

}
