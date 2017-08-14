package stacks;

import javax.swing.JOptionPane;

public class StackException extends Exception
{
	public StackException(int code)
	{
		switch(code)
		{
			case 1:
				JOptionPane.showMessageDialog(null, "You've reached your stack size limit!\nCannot push data onto a full stack!");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Your stack is currently empty!\nCannot pop data from an empty stack!");
				break;
		}
	}
}
