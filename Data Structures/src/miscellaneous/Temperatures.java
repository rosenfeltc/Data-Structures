package miscellaneous;

import java.util.Scanner;

public class Temperatures 
{
	public static void main(String[] args)
	{	
		float[][] temperatures;
		float average = 0;
		
		String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		String[] timeOfDay = {"Morning", "Afternoon", "Evening"};
		
		Scanner keyboard;
		
		temperatures = new float[daysOfWeek.length][timeOfDay.length];
		keyboard = new Scanner(System.in);
		
		for(int i = 0; i < daysOfWeek.length; i++)
		{
			for(int j = 0; j < timeOfDay.length; j++)
			{
				System.out.println("Please enter the temperature for " + daysOfWeek[i] + " " + timeOfDay[j]);
				temperatures[i][j] = keyboard.nextFloat();
			}
		}
		
		keyboard.close();
		
		for(int i = 0; i < daysOfWeek.length; i++)
		{
			average += temperatures[i][0];
		}
		average /= daysOfWeek.length;
		
		System.out.println("The average temperature for the mornings of the week was " + average);
	}
}
