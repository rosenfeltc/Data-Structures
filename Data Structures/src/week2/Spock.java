package week2;

import java.util.Scanner;

public class Spock 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int k, n;
		
		System.out.print("Enter how many total planets (n): ");
		n = keyboard.nextInt();
		System.out.print("Enter how many planets to explore (k): ");
		k = keyboard.nextInt();
		
		System.out.println("There are " + choosePlanets(n, k) + " ways to explore " + k + " out of " + n + " planets.");
		
		keyboard.close();
	}
	
	public static int choosePlanets(int n, int k)
	{
		if(k == 0)
		{
			return 1;
		}
		else if(k == n)
		{
			return 1;
		}
		else if(k > n)
		{
			return 0;
		}
		else
		{
			return choosePlanets(n-1, k-1) + choosePlanets(n-1, k);
		}
	}
}
