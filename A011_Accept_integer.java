package Assingmnt;

import java.util.Scanner;

public class A011_Accept_integer {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of num : ");
		int num=sc.nextInt();
		
		System.out.println("Output is : "+num+" + "+(num*10+num)+" + "+(num*100+num*10+num));
	}

}
