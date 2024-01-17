package Assingmnt;

class Display extends Thread
{
	
	@Override
	public void run() {
	
		System.out.println("Calling run 1 method");
		
	}
	
}

class Display1 extends Thread
{
	
	@Override
	public void run()
	{
		
		System.out.println("Calling run 2 method");
		
	}
	
}

public class A044_Thread_class {

	public static void main(String[] args) {
		
		
		Display d1=new Display();
		Display1 d2=new Display1();
		
		d1.start();
		d2.start();
		

	}

}
