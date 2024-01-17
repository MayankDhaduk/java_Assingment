package Assingmnt;


import java.util.HashMap;
import java.util.Map.Entry;

public class A062_Hash_map {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("Hi", 1);
		map.put("World", 2);
		map.put("Hello", 3);
		map.put("Java", 4);
		
		for(Entry<String, Integer> e : map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		
	}

}
