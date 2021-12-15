package lab5b;

import java.util.Scanner;

public class cs123 {

	public static void main(String[] args) {
		//Variable Declarations
		int space = 0, digit=0, letter = 0 ;
		String str; 
		
		//Reads keyboard
		Scanner pam = new Scanner(System.in);
		
		//Prompts user to enter string
		System.out.print("Enter the String:");
		str=pam.nextLine();
		
		//for loop
		for (int i=0; i<str.length(); i++)
		{
		    //Extracts characters
			char ch=str.charAt(i);
		  
		//if-else to look at the spaces, letters, and digits
		  if (ch==' ')
		  {
			space++;
		  }
		  else if (Character.isLetter(ch))
		  {
			  letter++;
		  }
		  else if (Character.isDigit(ch))
		  {
			  digit++;
		  }
	
		
	}
		
		//Output
		System.out.println("Number of spaces: "+space);
		System.out.println("Number of letter: "+letter);
		System.out.println("Number of digit: "+digit);
		
		
		
		
		
		
		
		
		
		
	}

}
