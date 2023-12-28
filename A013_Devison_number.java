package Assingmnt;

import java.util.Scanner;

public class A013_Devison_number {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
			
			if(i % 3 == 0)
			{
				System.out.print(" divisibility by 3 ");
			}
			
			 if(i % 5 == 0)
			{
				System.out.print(" divisibility by 5");
			}
			
			 if (i%3==0 && i%5==0) {
				System.out.print(" divisibility by 3 and 5");
			}
			 System.out.println();
		}
		
	}
		
		
		

	

}
