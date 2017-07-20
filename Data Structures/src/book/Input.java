package book;

import java.util.Scanner;

public class Input 
{
	public static void main(String[] args)
	{
		int nextValue;
		int sum = 0;
		Scanner kbInput = new Scanner(System.in);
		
		nextValue = kbInput.nextInt();
		while (nextValue > 0)
		{
			sum += nextValue;
			nextValue = kbInput.nextInt();
		}
		
		kbInput.close();
		
		System.out.println(sum);
	}
}
