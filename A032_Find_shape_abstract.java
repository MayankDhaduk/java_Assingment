package Assingmnt;

abstract class Shape
{
	public  abstract void Rectangelarea(double length,double width);
	
	public abstract void Squarearea(double side);
	
	public abstract void Criclearea(double radius);
		
}

class Area5 extends Shape
{
	@Override
	public void Rectangelarea(double length,double width)
	{
		System.out.println("Area of rectangel is : "+length*width);
	}
	
	@Override
	public void Squarearea(double side)
	{
		System.out.println("Area of Square : "+side*side);
	}
	
	@Override
	public void Criclearea(double radius)
	{
		System.out.println("Area of cricle is : "+radius*3.14);
	}
	
}

public class A032_Find_shape_abstract {

	public static void main(String[] args) {
		
		Area5 a1=new Area5();
		
		a1.Criclearea(5);
		a1.Rectangelarea(20, 30);
		a1.Squarearea(5);

	}

}
