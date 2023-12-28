package Assingmnt;

class Shape1
{
	public void printShape()
	{
		System.out.println("This is Shape");
	}
}

class Rectangle extends Shape1
{
	public void printRectangel()
	{
		System.out.println("This is Rectangle shape");
	}
}

class Cricle extends Shape1
{
	public void printCricle()
	{
		System.out.println("This is Cricle shape");
	}
}

class Square0 extends Rectangle
{
	public void printSquare()
	{
		System.out.println("Square is Rectangle");
	}
}
public class A034_area_class {

	public static void main(String[] args) {
		
		Shape1 s1=new Shape1();
		s1.printShape();
		
		Rectangle rr=new Rectangle();
		rr.printRectangel();
		
		Cricle c1=new Cricle();
		c1.printCricle();
		
		Square0 s0=new Square0();
		s0.printSquare();
		
	
	}

}
