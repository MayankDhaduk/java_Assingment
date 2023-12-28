package Assingmnt;

class Rectengel
{
	double length;
	double breath;
	 
	public Rectengel(double length,double breath) {
		
		this.length=length;
		this.breath=breath;
	}
	
	public void arearec()
	{
		double area=length*breath;
		
		System.out.println("Area of rectangel is : "+area);
	}
	
	public void perimeter()
	{
		double peritmeter=2*(length+breath);
		System.out.println("Perimeter is : "+peritmeter);
	}
}

class Square extends Rectengel
{
	public Square(double side) {
	
		super(side, side);
	}
	
	public void sqperi(double side)
	{
		System.out.println("Perimeter is : "+side*4);
	}
}
public class A026_Primeter {

	public static void main(String[] args) {
		
		Rectengel r1=new Rectengel(20, 20);
		r1.arearec();
		r1.perimeter();
		
		System.out.println();
		
		Square s1=new Square(3);
		s1.arearec();
		s1.sqperi(5);
				

	}

}
