package week2;

import java.util.Scanner;

public class BackwardString 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String theString, newString = "";
		
		System.out.print("Please enter a string: ");
		theString = keyboard.nextLine();
		newString = reverseString(theString);
		
		System.out.println("Okay, your string REVERSED is: " + newString);
		
		keyboard.close();
	}
	
	public static String reverseString(String toReverse)
	{
		String newString = "";
		int index = 0;
		return reverseString(toReverse, newString, index);
	}
	
	public static String reverseString(String toReverse, String reversed, int index)
	{
		if(toReverse.length() <= 1)
		{
			return toReverse;
		}
		else
		{
			reversed += toReverse.charAt(toReverse.length() - 1) + reverseString(toReverse.substring(0, toReverse.length() - 1));
			return reversed;
		}
	}
}
