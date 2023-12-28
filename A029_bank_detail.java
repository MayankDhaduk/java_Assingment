package Assingmnt;

abstract class Bank
{
	int a=100;
	int b=150;
	int c=200;
	
	public abstract void getBalance();
}

class BankA extends Bank
{
	//@Override
	public void getBalance()
	{
		System.out.println(a + "$ Deposited Amount");
	}
	
}

class BankB extends Bank
{
	
	//@Override
	public void getBalance()
	{
		System.out.println(b+"$ Deposited amount");
	}
	
}

class BankC extends Bank
{
	
	//@Override
	public void getBalance()
	{
		System.out.println(c+ "$ Deposited amount");
	}
}



public class A029_bank_detail {

	public static void main(String[] args) {
		
		
		BankA ba=new BankA();
		ba.getBalance();
		
//		System.out.println();
//		
//		
//		BankB bb=new BankB();
//		bb.getBalance();
//		
//		System.out.println();
		
		BankC bc=new BankC();
		bc.getBalance();
	}

}
