package week3;

import javax.swing.JOptionPane;

public class OptionDialog 
{
	public static void main(String[] args)
	{
		mainMenu();
	}
	
	public static void mainMenu()
	{
		String[] theOptions = {"Option1", "Option2", "Option3", "Option4", "Exit"};
		
		int theChoice =
			JOptionPane.showOptionDialog(null, "Choose an Option", "Options Demo", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, theOptions, 0);
		
		switch(theChoice)
		{
			case 0:
				JOptionPane.showMessageDialog(null, "You clicked Option1!");
				mainMenu();
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "You clicked Option2!");
				mainMenu();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "You clicked Option3!");
				mainMenu();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "You clicked Option4!");
				mainMenu();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "You clicked Exit! Okay, Bye!");
				System.exit(0);
				break;
		}
	}
}
