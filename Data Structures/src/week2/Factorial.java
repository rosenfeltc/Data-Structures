package week2;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int n;
		
		System.out.print("Please enter a positive integer less than 34 to determine its factorial: ");
		n = keyboard.nextInt();
		
		while(n < 1 || n > 33)
		{
			System.out.print("Invalid input. Enter positive integer less than 34: ");
			n = keyboard.nextInt();
		}
		
		System.out.println("Okay. The factorial of " + n + " (" + n + "!) = " + calculateFactorial(n));
		
		keyboard.close();
	}
	
	public static int calculateFactorial(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return n * calculateFactorial(n-1);
		}
	}
}
