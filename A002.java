package Assingmnt;

import java.util.Scanner;

public class A002 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of char : ");
		char ch=sc.next().charAt(0);
		
		if(ch == 'A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is "+"Vowel");
		}
		
//		else if(ch.lenght()> 1)
//		{
//			System.out.println("Error");
//			
//		}
			
		else
		{
			System.out.println(ch+" is "+"Consonant");
		}
		

	}

}
