package miscellaneous;

public class Q7 
{
	private class Node
	{
		// Fields
		private String name;
		private Node next;
		
		// Constructor
		public Node(String name)
		{
			this.name = name;
			this.next = null;
		}
		
		// Name Getter
		public String getName()
		{
			return this.name;
		}
		
		// Next Getter
		public Node getNext()
		{
			return this.next;
		}
		
		// Next Setter
		public void setNext(Node next)
		{
			this.next = next;
		}
	}
	
	// Field
	private Node root;
	
	// Constructor
	public Q7()
	{
		this.root = null;
	}
	
	public boolean isEmpty()
	{
		return this.root == null;
	}
	
	public void print()
	{
		Node printer = root;
		if(isEmpty())
		{
			System.out.println("List is empty!");
		}
		else
		{
			while(printer != null)
			{
				System.out.println(printer.getName());
				printer = printer.getNext();
			}
		}
	}
	
	public void insertAt(String insertAt, String toInsert)
	{
		if(isEmpty())
		{
			root = new Node(toInsert);
		}
		else
		{
			Node inserter = root;
			while(inserter.getNext() != null)
			{
				if(inserter.getName().equalsIgnoreCase(insertAt))
				{
					Node newNode = new Node(toInsert);
					newNode.setNext(inserter.getNext());
					inserter.setNext(newNode);
					return;
				}
				else
				{
					inserter = inserter.getNext();
				}
			}
			Node newNode = new Node(toInsert);
			inserter.setNext(newNode);
		}
	}
	
	public void deleteAt(String deleteAt)
	{
		if(isEmpty())
		{
			return;
		}
		else
		{
			Node searcher = root;
			while(searcher.getNext() != null)
			{
				if(searcher.getName().equalsIgnoreCase(deleteAt))
				{
					searcher.setNext(null);
				}
				else
				{
					searcher = searcher.getNext();
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Q7 list = new Q7();
		list.insertAt("Bob", "Alice");
		list.insertAt("Eve", "Bob");
		list.insertAt("Bob", "Carol");
		list.deleteAt("Eve");
		list.insertAt("Eve", "Eve");
		list.insertAt("Alice", "Frank");
		list.print();
		list.deleteAt("Bob");
		System.out.println("****");
		list.print();
	}
}
