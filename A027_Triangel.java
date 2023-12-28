package Assingmnt;

class Triangle
{
	
	int a;
	int b;
	int c;
	
	 Triangle() {
		this.a=3;
		this.b=4;
		this.c=5;
		
	}
	public void area(int base,int height)
	{
		
	System.out.println("Area of triangle is : "+(base*height)/2);	
	
	}
	
	public void perimeter()
	{
		System.out.println("Perimeter of triangle is : "+(a+b+c));
	}
	
}
public class A027_Triangel {

	public static void main(String[] args) {
		
		Triangle t=new Triangle();
		
		t.area(2, 3);
		t.perimeter();

	}

}
