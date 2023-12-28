package Assingmnt;

import java.util.Scanner;

public class A038_nested_try_catch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of num : ");

		int a[] = new int[5];

		for (int i = 0; i <= 5; i++) 
		{
			try {

				//a[i] = a[i] / 0;

				try {

					a[i] = sc.nextInt();

				}

				catch (ArrayIndexOutOfBoundsException e) {

					e.printStackTrace();

				}

			} 
			catch (ArithmeticException e) {

				e.printStackTrace();

			} finally {

			}
		}

	}

}
