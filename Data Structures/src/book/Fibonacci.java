package book;

public class Fibonacci 
{
	public static int recursiveFibonacci(int n)
	{
		if(n == 2 || n == 1)
		{
			return 1;
		}
		else
		{
			return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
		}
	}
	
	public static int nonRecursiveFibonacci(int n)
	{
		int one = 1;
		int two = 1;
		int answer = 1;
		
		for(int i = 2; i < n; i++)
		{
			answer = one + two;
			one = two;
			two = answer;
		}
		
		return answer;
	}
	
	public static void main(String[] args)
	{
		int number = 10;
		System.out.println("The fibonacci number for " + number + " is = " + recursiveFibonacci(number));
		System.out.println("The fibonacci number for " + number + " is = " + nonRecursiveFibonacci(number));
	}
}
