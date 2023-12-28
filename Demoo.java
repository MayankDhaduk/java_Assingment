package Assingmnt;

import java.util.*;

public class Demoo {
	
		    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Enter the alphabet : ");
	        String letter = scan.next();
	        
	       
	        
	            
	            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") || letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U"))
	            {
	                System.out.println("Vowel");
	            }
	            else if (! letter.matches("[a-zA-Z]") && letter.length() >= 1)
	            {
	                System.out.println("Error");
	            }
	            else
	            {
	                System.out.println("Consonant");
	            }
	        
	     
	    

	}

}
