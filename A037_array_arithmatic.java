package Assingmnt;

import java.util.Scanner;

public class A037_array_arithmatic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of num : ");
		
		int a[]=new int [3];
		
		for(int i=0;i<=3;i++)
		{
			//a[i]=sc.nextInt();
			try 
			{
				//a[i]=a[i]/0;
				a[i]=sc.nextInt();
				
			}
			catch (ArithmeticException e) {
				
				e.printStackTrace();
				System.out.println(a[2]);
				
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				
				e.printStackTrace();
				System.out.println(a[1]);
			}
		}

	}

}
