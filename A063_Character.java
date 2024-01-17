package Assingmnt;

import java.util.HashMap;

public class A063_Character {
	
	public static void main(String[] args) {
		
		String s="success";
		
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		
		char[]h = s.toCharArray();
		
		for(int i=0;i<=h.length-1;i++)
		{
			
			if(hs.get(h[i])==null)
			{
				hs.put(h[i], 1);
			}
			
			else
			{
				
				int k=hs.get(h[i]);
				k++;
				hs.put(h[i], k);
				
			}
			
		}
		
		System.out.println(hs);
		
		
		
		
	}

}
