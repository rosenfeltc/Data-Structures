package week2;

import java.util.Scanner;

public class Parade 
{
	public static void main(String[] args)
	{
		int n;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter length of parade: ");
		n = keyboard.nextInt();
		
		System.out.println("There are " + paradeLength(n) + " ways to organize the parade.");
		
		keyboard.close();
	}
	
	public static int paradeLength(int n)
	{
		if(n == 1)
		{
			return 2;
		}
		else if(n == 2)
		{
			return 3;
		}
		else
		{
			return (paradeLength(n-1)) + (paradeLength(n-2));
		}
	}
}
