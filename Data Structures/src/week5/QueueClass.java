package week5;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass 
{
	public static void main(String[] args)
	{
		Queue theQueue = new LinkedList();
		
		theQueue.add(5);
		theQueue.add(6);
		theQueue.add(7);
		
		System.out.println(theQueue.peek());
		
		theQueue.remove();
		
		System.out.println(theQueue.peek());
	}
}
