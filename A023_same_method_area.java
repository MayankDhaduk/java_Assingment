package Assingmnt;

class area
{
	public void sq(int i)
	{
		System.out.println("Square area is : "+i*i);
	}
	
	public void sq(int len,int bre)
	{
		System.out.println("Rectangel area is : "+len*bre);
	}
}
public class A023_same_method_area {

	public static void main(String[] args) {
		
		area a=new area();
		
		a.sq(5);
		a.sq(30, 2);
	}

}
