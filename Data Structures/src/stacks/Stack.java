package stacks;

import javax.swing.JOptionPane;

public class Stack 
{
	// Fields
	private Node top;
	private int stackSize;
	private int maxStackSize;
	
	// Constructor
	public Stack(int maxStackSize)
	{
		this.top = null;
		this.stackSize = 0;
		this.maxStackSize = maxStackSize;
	}
	
	// StackSize Getter
	private int getStackSize()
	{
		return this.stackSize;
	}
	
	// StackSize Setter
	private void setStackSize(int stackSize)
	{
		this.stackSize = stackSize;
	}
	
	// StackSize incrementer
	private void incrementStackSize()
	{
		this.stackSize++;
	}
	
	// StackSize decrementer
	private void decrementStackSize()
	{
		this.stackSize--;
	}
	
	// MaxStackSize getter
	private int getMaxStackSize()
	{
		return this.maxStackSize;
	}
	// Top Getter
	private Node getTop()
	{
		return this.top;
	}
	
	// Top Setter
	private void setTop(Node top)
	{
		this.top = top;
	}
	
	// Is stack empty?
	private boolean isEmpty()
	{
		return getTop() == null;
	}
	
	// Is stack full?
	private boolean isFull()
	{
		return getStackSize() == getMaxStackSize();
	}
	
	// Push method
	public void push(double data) throws StackException
	{
		if(isFull())
		{
			throw new StackException(1);
		}
		
		Node newNode = new Node(data);
		
		if(!isEmpty())
		{
			newNode.setNext(getTop());
		}
		
		setTop(newNode);
		incrementStackSize();
	}
	
	// Pop method
	public double pop() throws StackException
	{
		if(isEmpty())
		{
			throw new StackException(2);
		}
		
		double temp = peek();
		setTop(getTop().getNext());
		decrementStackSize();
		return temp;
	}
	
	// Peek method
	public double peek() throws StackException
	{
		if(isEmpty())
		{
			throw new StackException(2);
		}
		
		return getTop().getData();
	}
	
	// Print Method
	public void print()
	{
		if(isEmpty())
		{
			JOptionPane.showMessageDialog(null, "The stack is empty!\nNothing to print!");
			return;
		}
		
		Node current = getTop();
		String toPrint = new String();
		
		toPrint += "-->" + current.getData() + "\n";
		current = current.getNext();
		
		while(current != null)
		{
			toPrint += "   " + current.getData() + "\n";
			current = current.getNext();
		}
		
		toPrint +="-------------------------";
		
		// Display the data
		JOptionPane.showMessageDialog(null, toPrint);
	}
	
	// Pop all
	public double[] popAll() throws StackException
	{
		if(isEmpty())
		{
			throw new StackException(2);
		}
		
		int currentSize = getStackSize();
		double[] temp = new double[currentSize];
		
		for(int i = 0; i < currentSize; i++)
		{
			temp[i] = pop();
		}
		
		return temp;
		
	}
	private class Node
	{
		private double data;
		private Node next;
		
		// Constructor
		private Node(double data)
		{
			this.data = data;
			this.next = null;
		}
		
		// Data Getter
		private double getData()
		{
			return this.data;
		}
		
		// Data Setter
		private void setData(double data)
		{
			this.data = data;
		}
		
		// Next Getter
		private Node getNext()
		{
			return this.next;
		}
		
		// Next Setter
		private void setNext(Node next)
		{
			this.next = next;
		}
	}
}
