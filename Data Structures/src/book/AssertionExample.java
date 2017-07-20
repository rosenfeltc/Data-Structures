package book;

import java.util.Scanner;

public class AssertionExample
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your score: ");
		int score = reader.nextInt();
		assert (score >= 0 && score <= 100):"Score " + score + " is not in range  0 - 100";
		// Continue processing score
		System.out.println("Processing score...");
		reader.close();
	}
}
