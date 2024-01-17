package Assingmnt;

import java.util.Scanner;

public class A039_User_exception {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of num : ");
		int num=sc.nextInt();
		
		System.out.println("Enter the value of num1 : ");
		int num2=sc.nextInt();
		
		try
		
		{
			
		System.out.println(num/num2);
		
		}
		
		catch (ArithmeticException e) 
		{
			 
			e.printStackTrace();
			System.out.println("This program is running");
			
		}

	}

}
