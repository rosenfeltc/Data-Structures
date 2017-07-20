package week1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowCatch
{
	public static void main(String[] args)
	{
		try
		{
			exceptionExample(11);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("...but at least I can run the rest of my code!");
		}
		
		System.out.println("If we hadn't caught the exceptions, the program would never reach here!");
	}
	
	public static void exceptionExample(int x) throws FileNotFoundException, IOException
	{
		if(x <= 10)
		{
			throw new FileNotFoundException("The number was less than or equal to 10!");
		}
		else
		{
			throw new IOException("The number was greater than 10!");
		}
	}
}
