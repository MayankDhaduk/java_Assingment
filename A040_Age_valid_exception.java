package Assingmnt;

import java.util.Scanner;
import program.Agenotvalid;

class Vote
{
	int age;
	
	public void aligibel(int age) throws Agenotvalid
	{
		
		if(age < 18)
		{
			int ag=18-age;
			
			throw new Agenotvalid(ag);

		}
		
		else {
			
			System.out.println("Eligabel for vote");
			
		}
			
		
	}
}

public class A040_Age_valid_exception {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age : ");
		int age=sc.nextInt();
		
		Vote vv=new Vote();
		
		try
		{
			vv.aligibel(age);
		}
		
		catch (Agenotvalid e)
		{
			e.printStackTrace();
			e.validag();
		}

	}

}
