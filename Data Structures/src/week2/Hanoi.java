package week2;

import java.util.Scanner;

public class Hanoi 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int n;
		
		System.out.print("Please enter the number of disks: ");	
		n = keyboard.nextInt();
		solveTowers(n, 'A', 'B', 'C');
		
		keyboard.close();
	}
	
	public static void solveTowers(int n, char source, char spare, char destination)
	{
		if(n == 1)
		{
			System.out.println("Disk 1 from " + source + " to " + destination);
		}
		else
		{
			solveTowers(n - 1, source, destination, spare);
			System.out.println("Disk " + n + " from " + source + " to " + destination);
			solveTowers(n - 1, spare, source, destination);
		}
	}
}
