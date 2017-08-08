package week5;

public class Stack 
{
	// Fields
	private Node root;
	
	// Constructor
	public Stack()
	{
		this.root = null;
	}
	
	// Root Getter
	private Node getRoot()
	{
		return this.root;
	}
	
	// Root Setter
	private void setRoot(Node root)
	{
		this.root = root;
	}
	
	// Is Empty?
	private boolean isEmpty()
	{
		return this.root == null;
	}
	
	// Push method
	public void push(int data)
	{
		Node newNode = new Node(data);
		
		if(isEmpty())
		{
			setRoot(newNode);
		}
		else
		{
			newNode.setNext(getRoot());
			setRoot(newNode);
		}
	}
	
	// Pop method
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty!");
			return 0;
		}
		else
		{
			int temp = getRoot().getData();
			setRoot(getRoot().getNext());
			return temp;
		}
	}
	
	// Peek method
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty!");
			return 0;
		}
		else
		{
			return getRoot().getData();
		}
	}
	
	// Class within the class
	private class Node
	{
		// Fields
		private int data;
		private Node next;
		
		// Constructor
		private Node(int data)
		{
			this.data = data;
			this.next = null;
		}
		
		// Data Getter
		private int getData()
		{
			return this.data;
		}
		
		// Data Setter
		private void setData(int data)
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
