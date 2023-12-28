package Assingmnt;

import java.util.Scanner;

class Fact
{
	int fact=1;
	
	public void Factorial(int num)
	{
		
		for(int i=1;i<=num;i++)
		
			fact=fact*i;
			
			System.out.println("Factorial is : "+fact);
		
		
	}
}

public class A031_factorial {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		Fact f=new Fact();
		f.Factorial(num);
	}

}
