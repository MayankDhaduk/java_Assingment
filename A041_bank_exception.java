package Assingmnt;

import java.util.Scanner;

class bank1
{
	double balance;
	
	public void getBalance()
	{
		System.out.println("Your current balance is  : "+balance);
	}
	
	public void deposite(double amount)
	{
		balance += amount;
	}
	
	public void withdraw(double amount) throws Invalidbalanceexception
	{
		
		if(amount > balance)
		{
			double need = amount -balance;
			throw new Invalidbalanceexception(need);
		}
		else
		{
			balance -= amount;
		}
		
	}
	
	
}

public class A041_bank_exception {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		bank1 b1=new bank1();
		b1.getBalance();
		
		b1.deposite(500000);
		b1.deposite(200000);
		
		b1.getBalance();
		
		try {
			b1.withdraw(700000);
		} catch (Invalidbalanceexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getmessage();
			
		}
		
		
	
		
		
		

	}

}
