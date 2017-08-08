package week5;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class QueuePalindrome 
{
	public static void main(String[] args)
	{
		String theString = JOptionPane.showInputDialog("Please enter a String");
		
		JOptionPane.showMessageDialog(null, "Your string is a palindrome: " + checkPalindrome(theString));
	}
	
	public static boolean checkPalindrome(String theString)
	{
		Stack<Character> theStack = new Stack<Character>();
		Queue<Character> theQueue = new LinkedList<Character>();
		
		for(int i = 0; i < theString.length(); i++)
		{
			theStack.push(theString.charAt(i));
			theQueue.add(theString.charAt(i));
		}
		
		for(int i = 0; i < theString.length(); i++)
		{
			if(theStack.pop() != theQueue.remove())
			{
				return false;
			}
		}
		
		return true;
	}
}
