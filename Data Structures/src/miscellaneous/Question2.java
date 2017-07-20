package miscellaneous;

import javax.swing.JOptionPane;

public class Question2 
{
	public static boolean isPrime(int n)
	{
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		String number ="";
		int n;
		int primeCounter = 0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Please provide a number: "));
		
		for(int i = 2; i <= n; i++)
		{
			if(isPrime(i))
			{
				number += i + " ";
				primeCounter++;
				
				if(primeCounter % 10 == 0)
				{
					number += "\n";
				}
			}		
		}
		
		JOptionPane.showMessageDialog(null, "The prime numbers less than or equal to " + n + " are:\n\n" + number);
	}
}
