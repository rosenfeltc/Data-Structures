package week1;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile 
{
	public static void main(String[] args)
	{
		File inFile = new File("C:/Users/chris/Desktop/test.txt");
		
		String fileContents = new String();
		
		try
		{
			Scanner fileReader = new Scanner(inFile);
			
			while(fileReader.hasNext())
			{
				fileContents += "\n" + fileReader.nextLine();
			}
			
			fileReader.close();
		}
		catch(IOException e)
		{
			System.out.println("ERROR reading file!");
			System.out.println("EXITING PROGRAM.");
			System.exit(1);
		}
		
		
		System.out.println("Okay, I read the file! Here's what the contents were:");
		System.out.println(fileContents);
	}
}
