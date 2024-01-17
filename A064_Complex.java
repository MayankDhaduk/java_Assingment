package Assingmnt;

class Complex
{
	
	int real;
	int img;
	
	public Complex(int real,int img)
	{
		
		this.img=img;
		this.real=real;
		
	}
	
	public void print()
	{
		System.out.println(real+" + i"+img);
	}
	
	public static Complex add(Complex c,Complex c1)
	{
		Complex a = new Complex(0,0);
		a.img=c.img+c1.img;
		a.real=c.real+c1.real;
		
		return a;
		
	}
	
	
}

public class A064_Complex {
	
	public static void main(String[] args) 
	{
		
		Complex c=new Complex(10, 20);
		Complex c1=new Complex(20, 30);
		
		c.print();
		c1.print();
		
		Complex k=Complex.add(c, c1);
		k.print();
		
	
		
		
		
	}
	
	

}
