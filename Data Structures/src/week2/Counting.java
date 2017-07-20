package week2;

import java.util.Scanner;

public class Counting
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String theString, tempString = "";
		char theChar;
		
		System.out.print("Please enter a string: ");
		theString = keyboard.nextLine();
		System.out.print("Please enter a character to find in your string: ");
		tempString = keyboard.nextLine();
		theChar = tempString.charAt(0);
		
		System.out.println("Okay, the character " + theChar + " appears in the string " + theString + " "
				+ countLetter(theString, theChar, 0) + " times.");
		keyboard.close();
	}
	
	public static int countLetter(String theString, char theChar, int index)
	{
		if(index == theString.length() - 1)
		{
			if(theChar == theString.charAt(index))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			if(theChar == theString.charAt(index))
			{
				return 1 + countLetter(theString, theChar, index + 1);
			}
			else
			{
				return 0 + countLetter(theString, theChar, index + 1);
			}
		}
	}
}
