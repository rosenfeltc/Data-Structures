package week2;

import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int n; 
		
		System.out.print("Please enter n: ");
		n = keyboard.nextInt();
		
		System.out.print("Okay, the nth term (where n = " + n + ") in the Fibonacci sequence is " + fib(n));
		
		keyboard.close();
	}
	
	public static int fib(int n)
	{
		int first = 0;
		int second = 1;
		return fib(first, second, 2, n);
	}
	
	public static int fib(int first, int second, int counter, int n)
	{
		int temp = first;
		first = second;
		second = first + temp;
		
		if(counter == n)
		{
			return second;
		}
		else
		{
			return fib(first, second, counter + 1, n);
		}
	}
}
