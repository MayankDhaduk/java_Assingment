package Assingmnt;

class Testdeamonthread2 extends Thread
{
	
	 public void run()
	 {
		 if(currentThread().isDaemon())
		 {
			 System.out.println("Deamon Thread");
		 }
		 
		 else
		 {
			 System.out.println("Not deamon thread");
		 }
	 }
	
	
	
}

public class A047_check_Deamon_class {

	public static void main(String[] args) {
		
		Testdeamonthread2 t1=new Testdeamonthread2();
		Testdeamonthread2 t2=new Testdeamonthread2();
		Testdeamonthread2 t3=new Testdeamonthread2();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
		
	

	}

}
