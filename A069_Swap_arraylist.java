package Assingmnt;

import java.util.ArrayList;
import java.util.Collections;

public class A069_Swap_arraylist {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> art=new ArrayList<Integer>();
		
		art.add(10);
		art.add(20);
		art.add(30);
		art.add(40);
		
		Collections.swap(art, 1, 2);
		
		System.out.println(art);
		
		
		
	}

}
