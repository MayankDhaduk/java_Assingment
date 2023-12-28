package Assingment;

abstract class Parent
{
	public abstract void message();	
}

class SubclassA extends Parent
{
	public void message()
	{
		System.out.println("This i s firstsub class ");
	}
}
class SubclassB extends Parent
{
	public void message() {
		System.out.println("This is secondsub class");
	}
}
public class A028_Abstract {

	public static void main(String[] args)
	{
		SubclassA sa=new SubclassA();
		sa.message();
		
		System.out.println();
		
		SubclassB sb = new SubclassB();
		sb.message();

	}

}
