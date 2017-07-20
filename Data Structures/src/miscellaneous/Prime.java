package miscellaneous;

import javax.swing.JOptionPane;

public class Prime
{
	private int userNumber;
	
	public Prime()
	{
		userNumber = 0;
	} // end method Prime
	
	public void letUserPickANumber()
	{
		String numberAsString = new String("");
		
		numberAsString = JOptionPane.showInputDialog("Please enter a number: ");
		userNumber = (int) Integer.parseInt(numberAsString);
	} // end method letUserPickANumber
	
	private boolean isPrime(final int number)
	{
		int squareRoot;
		
		if(number <= 1)
		{
			return false;
		}
		
		if(number == 2)
		{
			return true;
		}
		
		if(number %2 == 0)
		{
			return false;
		}
		
		squareRoot = (int) Math.sqrt(number);
		
		for(int i = 3; i <= squareRoot; i += 2)
		{
			if(number % i == 0)
			{
				return false;
			}
		}
		
		return true;
	} // end method is prime
	
	public void printAllPrimeNumbers()
	{
		String string = new String("");
		int primeCounter = 0;
		
		for(int i = 2; i <= userNumber; i++)
		{
			if(isPrime(i))
			{
				string += i + "  ";
				primeCounter++;
				
				if(primeCounter % 10 == 0)
				{
					string += "\n";
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, string);
	} // end method printAllPrimeNumbers
	
	public static void main(String[] args)
	{
		Prime prime = new Prime();
		prime.letUserPickANumber();
		prime.printAllPrimeNumbers();
	}
}
