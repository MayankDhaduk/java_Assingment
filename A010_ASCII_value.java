package Assingmnt;

import java.util.Scanner;

public class A010_ASCII_value {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character : ");
		char ch=sc.next().charAt(0);
		
		System.out.println("ASCII value is : "+(int)ch);

	}

}
