package week2;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String theWord;
		
		System.out.print("Please enter a word and I'll check if it's a palindrome: ");
		theWord = keyboard.nextLine();
		
		System.out.println("The word " + theWord + " is a palindrome: " + isPalindrome(theWord));
		
		keyboard.close();
	}
	
	public static boolean isPalindrome(String theWord)
	{
		if(theWord.length() <= 1)
		{
			return true;
		}
		else if(theWord.charAt(0) == theWord.charAt(theWord.length() - 1))
		{
			return isPalindrome(theWord.substring(1, theWord.length() - 1));
		}
		else
		{
			return false;
		}
	}
}
