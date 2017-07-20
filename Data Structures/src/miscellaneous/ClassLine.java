package miscellaneous;

import java.util.Random;

public class ClassLine
{
	public static void main(String[] args)
	{
		int randomNumber;
		final int upperBound = 25;
		final int lowerBound = 10;
	
		Random generator = new Random();
		randomNumber = generator.nextInt();
		System.out.println(randomNumber);
	
		for(int i = 0; i < 10; i++)
		{
			randomNumber = generator.nextInt();
			randomNumber = Math.abs(randomNumber);
			randomNumber %= (upperBound - lowerBound + 1);
			randomNumber += lowerBound;
			
			System.out.println(randomNumber);
		}
	}
}
