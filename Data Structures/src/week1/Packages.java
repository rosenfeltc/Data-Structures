package week1;

import java.util.Random;

public class Packages 
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		
		int randomNumber = Math.abs(generator.nextInt()) % 101;
		System.out.println(randomNumber);
	}
}
