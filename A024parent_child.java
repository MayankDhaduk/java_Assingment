package Assingmnt;

class parent
{
	public void par()
	{
		System.out.println("Parent class....");
	}
	
}

class child extends parent
{
	public void ch() {
		System.out.println("Child class....");
	}
}
public class A024parent_child {

	public static void main(String[] args) {
		
		parent p=new parent();
		child cc=new child();
		
		//parent method
		p.par();
		
		//child method
		cc.ch();
		
		//child in parent method
		
		cc.par();
	}

}
