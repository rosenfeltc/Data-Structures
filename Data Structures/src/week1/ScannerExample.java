package week1;

import java.util.Scanner;

public class ScannerExample 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();
		
		System.out.print("\nPlease enter your age: ");
		age = keyboard.nextInt();
		
		System.out.println("Okay, your name is " + name + " and you are " + age + " years old!");
		
		keyboard.close();
	}
}
