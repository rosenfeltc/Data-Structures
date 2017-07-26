package week3;

public class LinkedList 
{
	private class Node
	{
		private String name;
		private Node next;
	
		private Node()
		{
			this.name = new String();
			this.next = null;
		}
		private Node(String name)
		{
			this.name = name;
			this.next = null;
		}
	}
	
	private Node head;
	
	public LinkedList() // No- arg constructor
	{
		this.head = null;
	}
	
	public boolean isEmpty()
	{
		/* if(this.head == null)
		 * {
		 * 	return true;
		 * }
		 * else
		 * {
		 * 	return false;
		 * }
		 * 
		 */
		return (this.head == null);
	}
		
	public void add(String name)
	{
		Node newNode = new Node(name);
		
		if(isEmpty())
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void printLL() // traverse the list and print each Node's data
	{
		Node curr = head;
		
		if(isEmpty())
		{
			System.out.println("The list is Empty");
		}
		else
		{
			while(curr != null)
			{
				System.out.println(curr.name);
				curr = curr.next;
			}
		}
	}
	
	public Node search(String toFind)
	{
		Node searcher = head;
		
		while(searcher != null)
		{
			if(searcher.name.equals(toFind))
			{
				return searcher;
			}
			else
			{
				searcher = searcher.next;
			}
		}
			
		return null;
	}
}
