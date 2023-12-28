package Assingmnt;

import java.util.Scanner;

class Grade {
	double p1;
	double p2;
	double p3;
	double p4;
	double p5;

	public Grade(double p1, double p2, double p3, double p4, double p5) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
	}

	public void sum() {
		double ad = p1 + p2 + p3 + p4 + p5;

		System.out.println("Sum of all Subject is : " + ad);

		double av = (p1 + p2 + p3 + p4 + p5) * 100 / 500;

		System.out.println("Average is : " + av);

		if (av >= 91 && av <= 100) {
			System.out.println("A grade");
		}

		else if (av >= 81 && av <= 90) {
			System.out.println("B grade");
		}

		else if (av >= 71 && av <= 80) {
			System.out.println("B grade");
		}

		else if (av >= 61 && av <= 70) {
			System.out.println("C grade");
		}

		else if (av >= 51 && av <= 60) {
			System.out.println("D grade");
		}

		else if (av >= 41 && av <= 50) {
			System.out.println("DD grade");
		}

		else {
			System.out.println("FAIL");
		}

	}

}

public class A033_Student_grade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of SUB1 : ");
		double p1 = sc.nextDouble();

		System.out.println("Enter the value of SUB2 : ");
		double p2 = sc.nextDouble();

		System.out.println("Enter the value of SUB3 : ");
		double p3 = sc.nextDouble();

		System.out.println("Enter the value of SUB4 : ");
		double p4 = sc.nextDouble();

		System.out.println("Enter the value of SUB5 : ");
		double p5 = sc.nextDouble();

		Grade g1 = new Grade(p1, p2, p3, p4, p5);
		g1.sum();

	}

}
