package Assingmnt;

import java.util.Scanner;

public class A007_pattern_02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int count=1;
		
		System.out.println("Enter the value of num : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			
			System.out.println();
		}

	}

}
