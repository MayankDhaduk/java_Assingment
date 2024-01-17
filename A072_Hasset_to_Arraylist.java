package Assingmnt;

import java.util.ArrayList;
import java.util.HashSet;

public class A072_Hasset_to_Arraylist {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs =new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		
		ArrayList<Integer> art = new ArrayList<Integer>(hs);
		
		System.out.println(art);
		
		
	}

}
