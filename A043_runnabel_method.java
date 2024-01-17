package Assingmnt;

class dis implements Runnable
{
	public void run() 
	{
		System.out.println("Hello world");
	}
}

public class A043_runnabel_method {

	public static void main(String[] args)
	{
		
		
		dis d1=new dis();
		
		Thread t1=new Thread(d1);
		
		t1.start();
		
	//	System.out.println("Hello java");
		

	}

}
