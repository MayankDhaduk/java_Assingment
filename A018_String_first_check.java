package Assingmnt;

import java.util.Scanner;

public class A018_String_first_check {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s1=sc.nextLine();
		
		System.out.println(s1.startsWith("Red"));
		
		System.out.println("Enter the String : ");
		String s2=sc.nextLine();
		
		System.out.println(s2.startsWith("Red"));

	}

}
