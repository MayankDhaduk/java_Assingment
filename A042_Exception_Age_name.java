package Assingmnt;

class AgeNotWithinRangeException extends Exception {
	int age;

	public AgeNotWithinRangeException(int age) {
		this.age = age;

		System.err.println("Age not valid ......");
	}

}

class NameNotValidException extends Exception {
	String name;

	public NameNotValidException(String name) {
		this.name = name;

		System.err.println("Name contains some special character and numbers...please input in correct form....");
	}
}

class Student {
	int rollno;
	String name;
	int age;
	String course;

	public Student(int rollno, String name, int age, String course) 
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public void notvalidage() throws AgeNotWithinRangeException
	{
		if(age>15 && age<21)
		{
			System.out.println("Valid age .....");
		}
		
		else
		{
			throw new AgeNotWithinRangeException(age);
		}
	}
	
	public void namenotvalid()throws NameNotValidException
	{
		for(int i=0; i<name.length(); i++)
		{
			if(!Character.isLetter(name.charAt(i))&& !Character.isWhitespace(name.charAt(i)))
			{
				throw new NameNotValidException(name);
			}
		}
		System.out.println("Valid Name...");
	}

}

public class A042_Exception_Age_name {

	public static void main(String[] args)
	{
			
		Student ss=new Student(1, "Mayank", 17, "Back end");
		Student s1=new Student(2, "$$@", 20, "CCCCC");
		
		
		
		
		try {
			ss.notvalidage();
		} catch (AgeNotWithinRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ss.namenotvalid();
		} catch (NameNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
