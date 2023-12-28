package Assingmnt;

abstract class Marks
{
	public  abstract void getPercentage();
}

class StudentA extends Marks
{

	double m1;
	double m2;
	double m3;
	
	StudentA(double m1,double m2,double m3) {
	
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	public void getPercentage()
	{
		System.out.println("Studen A percentage : "+(m1+m2+m3)/3);
	}
	
}

class StudentB extends Marks
{
	double m1;
	double m2;
	double m3;
	double m4;
	
	 StudentB(double m1,double m2,double m3,double m4)
	 {
		 
		 this.m1=m1;
		 this.m2=m2;
		 this.m3=m3;
		 this.m4=m4;
		
	}
	 
	 public void getPercentage()
	 {
		 System.out.println("Student B percentage : " + (m1+m2+m3+m4)/4);
	 }
}

public class A030_student_result {

	public static void main(String[] args) {
		

		StudentA sa=new StudentA(50, 90, 80);
		
		sa.getPercentage();
		
		StudentB sb=new StudentB(50, 80, 75, 95);
		
		sb.getPercentage();
	}

}
