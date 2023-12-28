package Assingmnt;

class printnum
{
	public void printn(int num)
	{
		System.out.println("Print integer : "+num);
	}
	
	public void printn(float num)
	{
		System.out.println("Print float : "+num);
	}
	
	public void printn(double num) 
	{
		System.out.println("Print double : "+num);
	}
	
	public void printn(String num)
	{
		System.out.println("Print String : "+num);
	}
	
	public void printn(long  num) {
		System.out.println("Print long : "+num);
	}
	
	
}
public class A021_Class_value {

	public static void main(String[] args) {
		
		printnum pn=new printnum();
		
		pn.printn(20);
		pn.printn(20.30f);
		pn.printn(3.154545);
		pn.printn(2030104050l);
		pn.printn("hello world");
		

	}

}
