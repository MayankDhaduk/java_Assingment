package Assingmnt;

import java.util.ArrayList;

public class A070_join_Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> art=new ArrayList<Integer>();
		art.add(10);
		art.add(20);
		art.add(30);
		art.add(40);
		
		ArrayList<Integer> art1 = new ArrayList<Integer>(art);
		
		System.out.println(art1);
		
	}

}
