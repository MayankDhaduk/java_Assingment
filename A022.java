package Assingmnt;

class numb
{
	public void pnum(int num,char ch)
	{
		System.out.println("The number is : "+num+" The character is : "+ch);
	}
	
	public void pnum(char ch,int num)
	{
		System.out.println("The number is : "+ch+" The character is : "+num);
	}
	
	
}
public class A022 {

	public static void main(String[] args) {

		numb nu=new numb();
		nu.pnum(10, 'A');
		nu.pnum('B', 20);
		

	}

}
