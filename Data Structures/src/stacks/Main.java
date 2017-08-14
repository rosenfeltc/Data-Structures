package stacks;

import javax.swing.JOptionPane;

public class Main 
{
	public static void main(String[] args) throws StackException
	{
		Stack theStack = new Stack(10);
		
		try
		{
			theStack.push(10);
			theStack.print();
			theStack.pop();
			theStack.print();
			theStack.pop();
			
			for(int i = 0; i < 9; i++)
			{
				theStack.push(i);
			}
			
			theStack.print();
			theStack.push(12341);
			theStack.print();
//			theStack.push(1241);
//			theStack.print();
		}
		catch(StackException e)
		{
			JOptionPane.showMessageDialog(null, "Try block stopped executing because of exception");
		}
		
		JOptionPane.showMessageDialog(null, "But I can still keep going!!!");
	}
}
