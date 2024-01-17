package Assingmnt;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class A059_Linkhasset_Append {

	public static void main(String[] args) {

	LinkedHashSet<String> hsa=new LinkedHashSet<String>();
	
	hsa.add("Java");
	hsa.add("Andriod");
	hsa.add("Sql");
	hsa.add("Ios");
	
	System.out.println(hsa);
	
	hsa.add("Php");
	
	Iterator<String> itr=hsa.iterator();
	while (itr.hasNext())
	{
		System.out.println(itr.next());
	}

	
	}
}
