package Assingmnt;

import java.util.ArrayList;
import java.util.Scanner;

public class A076_Retrive_arraylist {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> art=new ArrayList<Integer>();
		art.add(10);
		art.add(20);
		art.add(30);
		art.add(40);
		art.add(50);
		art.add(60);
		
		System.out.println("Total element is : "+art);
		
		
		System.out.println("Choose Element : ");
		int ind =sc.nextInt();
		
		System.out.println("Your element is : "+art.get(ind));
		
		
		
		
	}

}
