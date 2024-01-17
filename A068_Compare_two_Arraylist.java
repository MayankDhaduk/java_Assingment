package Assingmnt;

import java.util.ArrayList;

public class A068_Compare_two_Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String>ar1 = new ArrayList<String>();
		ar1.add("Apple");
		ar1.add("Banana");
		ar1.add("Mango");
		ar1.add("Kiwi");
		ar1.add("Pineapple");
		
		ArrayList<String> ar2 =new ArrayList<String>();
		ar2.add("Apple");
		ar2.add("Banana");
		ar2.add("Mango");
		ar2.add("Kiwi");
		ar2.add("Pineapple");
		
		int m=0;
		
		if(ar1.size()!= ar2.size())
		{
			System.out.println("Not Equal");
		}
		else
		{
			for(int i=0;i<ar1.size();i++)
			{
				if(ar1.get(i)!=ar2.get(i))
				{
					m=1;
					break;
				}
				
			}
			
			if(m==0)
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not Equal");
			}
		}
		
		
		
		
	}

}
