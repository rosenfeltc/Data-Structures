package week5;

public class ReferenceQueue 
{
	// Fields
	private Node front;
	private Node back;
	
	// Constructor
	public ReferenceQueue()
	{
		this.front = null;
		this.back = null;
	}
	
	// Front Getter
	private Node getFront()
	{
		return this.front;
	}
	
	// Front Setter
	private void setFront(Node front)
	{
		this.front = front;
	}
	
	// Back Getter
	private Node getBack()
	{
		return this.back;
	}
	
	// Back Setter
	private void setBack(Node back)
	{
		this.back = back;
	}
	
	// Is empty?
	private boolean isEmpty()
	{
		return getFront() == null;
	}
	
	// Obtain the current size of the Queue
	public int size()
	{
		int counter = 0;
		
		if(isEmpty())
		{
			return counter;
		}
		else
		{
			Node sizer = getFront();
			
			while(sizer != null)
			{
				counter++;
				sizer = sizer.getNext();
			}
			
			return counter;
		}
	}
	
	// Add Node to the queue
	public void enqueue(int data)
	{
		Node newNode = new Node(data);
		
		if(isEmpty())
		{
			setFront(newNode);
		}
		else if(size() == 1)
		{
			setBack(newNode);
			getFront().setNext(getBack());
			getBack().setPrevious(getFront());
		}
		else
		{
			getBack().setNext(newNode);
			newNode.setPrevious(getBack());
			setBack(newNode);
		}
	}
	
	// Remove Node from the queue
	public void dequeue()
	{
		if(size() == 1)
		{
			destroy();
		}
		else
		{
			getFront().getNext().setPrevious(null);
			setFront(getFront().getNext());
		}
	}
	
	// Peek first item in the queue
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("The queue is empty!");
			return 0;
		}
		else
		{
			return getFront().getData();
		}
	}
	
	// Destroy method
	public void destroy()
	{
		setFront(null);
	}
	
	// Print method
	public void print()
	{
		if(isEmpty())
		{
			System.out.println("The queue is empty!");
		}
		else
		{
			Node printer = getFront();
			
			while(printer != null)
			{
				System.out.println(printer.getData() + " ");
				printer = printer.getNext();
			}
		}
	}
	
	// Class within the class
	private class Node
	{
		// Fields
		private int data;
		private Node next;
		private Node previous;
		
		// Constructor
		private Node(int data)
		{
			this.data = data;
			this.next = null;
			this.previous = null;
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
		
		// Previous Getter
		private Node getPrevious()
		{
			return this.previous;
		}
		
		// Previous Setter
		private void setPrevious(Node previous)
		{
			this.previous = previous;
		}
	}
}
