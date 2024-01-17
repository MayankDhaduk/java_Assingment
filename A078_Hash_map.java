package Assingmnt;

import java.util.HashMap;

public class A078_Hash_map {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> has =new HashMap<Integer, String>();
		
		has.put(1, "Hello");
		has.put(2, "World");
		has.put(3, "Java");
		
		System.out.println(has.entrySet());
		
		
		
	}

}