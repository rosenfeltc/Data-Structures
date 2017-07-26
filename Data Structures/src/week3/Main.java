package week3;

import javax.swing.JOptionPane;

public class Main 
{
	public static void main(String[] args)
	{
		LinkedList theList = new LinkedList();
		String theString;
		
		while(!(theString = JOptionPane.showInputDialog("Please enter a name")).equals (""))
		{
			theList.add(theString);
			System.out.println("************************************");
			theList.printLL();
		}
		
	}
}
