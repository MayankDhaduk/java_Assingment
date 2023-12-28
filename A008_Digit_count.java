package Assingmnt;

import java.util.Scanner;

public class A008_Digit_count {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of num : ");
		int num=sc.nextInt();
		
		
		int count=0;
		
		while (num > 0) 
		{
			
			num=num/10;
			count++;
		}
		
		System.out.println("All digit is : "+count);
	}

}
