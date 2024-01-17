package Assingmnt;

import java.util.ArrayList;
import java.util.Collections;

public class A058_Arraylist_Shuffel {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> it=new ArrayList<Integer>();
		
		it.add(0);
		it.add(1);
		it.add(2);
		it.add(3);
		it.add(4);
		
	  Collections.shuffle(it);
	  
	  for(int s : it)
	  {
		  System.out.println(s);
	  }
		
		
		
	}

}
