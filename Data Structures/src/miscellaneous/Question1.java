package miscellaneous;

import javax.swing.JOptionPane;

public class Question1
{
	public static void main(String[] args)
	{	
		int userNumber = -1;
		int max1 = 0;
		int max2 = 0;
		
		do
		{
			userNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter a positive integer (-1 to exit): "));
			
			if(userNumber > max1)
			{
				max2 = max1;
				max1 = userNumber;
			}
			else if(userNumber > max2)
			{
				max2 = userNumber;
			}
		} while(userNumber != -1);
		
		JOptionPane.showMessageDialog(null, "Max1 = " + max1 + "\nMax2 = " + max2);
	}
}
