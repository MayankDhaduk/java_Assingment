package Assingmnt;

import java.util.Scanner;

public class Subjec_sum_Avg {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the fist number : ");
		int num=sc.nextInt();
		
		System.out.println("Enter the Second number : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the Thired number : ");
		int num2=sc.nextInt();
		
		System.out.println("Enter the Four number : ");
		int num3=sc.nextInt();
		
		System.out.println("Enter the five number : ");
		int num4=sc.nextInt();
		
		int result=num+num1+num2+num3+num4;
		
		System.out.println("sum is : "+result);
		
		double avg=result/5;
		
		System.out.println("Avg is : "+avg);

	}

}
