package Assingmnt;

import java.util.Scanner;

public class A035_Arethmetic_exception {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of num : ");
		int num=sc.nextInt();
		
		System.out.println("Enter the value of num1 : ");
		int num1=sc.nextInt();
		
		try 
		{
			System.out.println(num/num1);
		}
		catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
	}

}
