package Assingmnt;
class S1 extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("Th1 "+i);
		}
	}
}
class S2 extends Thread
{
	@Override
	public void run() {
		for(int i=0; i<=10; i++)
		{
			System.out.println("Th2 "+i);
		}
	}
}
public class A045_sleep {
	
	public static void main(String[] args) 
	{
		S1 S1 = new S1();
		S2 S2 = new S2();
		
		try {
			S2.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		S1.start();
		S2.start();
		
	}

}
