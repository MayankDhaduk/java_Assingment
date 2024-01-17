package Assingmnt;

class Testthreadtwice1 extends Thread
{
	public void run()
	{
		
		System.out.println("Calling run method......");
	}
}

public class A046_Same_thread 
{
	

	public static void main(String[] args) {
		
		Testthreadtwice1 t1 = new Testthreadtwice1();
		
	
		
		t1.start();
		t1.start();
		
		
	}
	
	
	
	

}
