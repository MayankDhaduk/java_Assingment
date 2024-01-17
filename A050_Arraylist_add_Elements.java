package Assingmnt;

import java.util.ArrayList;

public class A050_Arraylist_add_Elements {
	
	public static void main(String[] args) {
		
		ArrayList<String> str=new ArrayList<String>();
		
		str.add("Red");
		str.add("Blue");
		str.add("Yellow");
		str.add("White");
		
		System.out.println("Orignal color : "+str);
		
		String newelement="Black";
		str.add(4, newelement);
		
		for(String st : str)
		{
			System.out.println(st);
		}
		
		
	}

}
