package Assingmnt;

import java.util.Scanner;

class Member
{
	int id =1;
	String name="Mayank";
	int age=17;
	String addreass="Surat";
	long num=9992222888l;
	double salary =200000;
		
	
	public void printsalary() {
		
		System.out.println("Salary is : "+salary);
		
	}
}

public class A025_Datamembers {

	public static void main(String[] args) {


		Member mm=new Member();
		mm.printsalary();

	}

}
