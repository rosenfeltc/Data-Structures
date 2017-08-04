package week4;

import javax.swing.JOptionPane;

public class BinaryTree 
{
	public static void main(String[] args)
	{
		BinaryTree theTree = new BinaryTree();
		theTree.add("Tolga", "555-555-0001");
		theTree.add("Andrew", "555-555-0002");
		theTree.add("Zach", "555-555-0003");
		theTree.printInOrder();
		System.out.println("Tolga's phone number is " + theTree.search("Tolga"));
		System.out.println("Zach's phone number is " + theTree.search("Zach"));
	}
	private class Node
	{
		// Fields
		private int counter;
		private String name;
		private String phoneNumber;
		private Node leftChild;
		private Node rightChild;
		private Node parent;
		
		// Constructor
		private Node(String name, String phoneNumber)
		{
			this.counter = 1;
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.leftChild = null;
			this.rightChild = null;
			this.parent = null;
		}
		
		// Counter Getter
		private int getCounter()
		{
			return this.counter;
		}
		
		// Increment Counter
		private void incrementCounter()
		{
			this.counter = this.counter++;
		}
		
		// Decrement Counter
		private void decrementCounter()
		{
			this.counter = this.counter--;
		}
		
		// Name Getter
		private String getName()
		{
			return this.name;
		}
		
		// Name Setter
		private void setName(String name)
		{
			this.name = name;
		}
		
		// Phone number Getter
		private String getPhoneNumber()
		{
			return this.phoneNumber;
		}
		
		// Phone number Setter
		private void setPhoneNumber(String phoneNumber)
		{
			this.phoneNumber = phoneNumber;
		}
		
		// Left child Getter
		private Node getLeftChild()
		{
			return this.leftChild;
		}
		
		// Left child Setter
		private void setLeftChild(Node leftChild)
		{
			this.leftChild = leftChild;
		}
		
		// Right child Getter
		private Node getRightChild()
		{
			return this.rightChild;
		}
		
		// Right child Setter
		private void setRightChild(Node rightChild)
		{
			this.rightChild = rightChild;
		}
		
		// Parent Getter
		private Node getParent()
		{
			return this.parent;
		}
		
		// Parent Setter
		private void setParent(Node parent)
		{
			this.parent = parent;
		}
		
		// Is Node a leaf
		private boolean isLeaf()
		{
			return getRightChild() == null && getLeftChild() == null;
		}
	}//END NODE CLASS
	
	// Field
	private Node root;
	
	// Constructor
	public BinaryTree()
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
	
	// Is Binary Tree empty?
	public boolean isEmpty()
	{
		return getRoot() == null;
	}
	
	// The actual add method to add a new Node into the Binary Search Tree
	public void add(String name, String phoneNumber)	// Assuming this is an in-order tree
	{
		Node newNode = new Node(name, phoneNumber);
		
		if(isEmpty())
		{
			setRoot(newNode);
		}
		else
		{
			addRecursive(getRoot(), newNode);
		}
	}// END add METHOD
	
	// This is the recursive add helper method
	public void addRecursive(Node current, Node newNode)
	{
		// Data has the same name so increment counter but do not add duplicate to tree
		if(newNode.getName().equalsIgnoreCase(current.getName()))
		{
			current.incrementCounter();
			return;
		}
		// New Node goes to the left of current Node
		else if(newNode.getName().compareToIgnoreCase(current.getName()) < 0)
		{
			// Left Side is empty
			if(current.getLeftChild() == null)
			{
				// Add node to the left
				current.setLeftChild(newNode);
				return;
			}
			// Left Side is not empty
			else
			{
				// Continue searching along left subtree
				addRecursive(current.getLeftChild(), newNode);
			}
		}
		// New Node goes to the right of current Node
		else
		{
			// Right Side is empty
			if(current.getRightChild() == null)
			{
				// Add node to the right
				current.setRightChild(newNode);
				return;
			}
			// Right side is not empty
			else
			{
				// Continue searching along right subtree
				addRecursive(current.getRightChild(), newNode);
			}
		}
	}// END addRecursive METHOD
	
	// Method that traverses the list and prints each Node in order
	public void printInOrder()
	{
		printInOrderRecursive(getRoot());
	}// END printInOrder METHOD
	
	// Recursive method that helps printInOrder
	public void printInOrderRecursive(Node current)
	{
		// Current Node is not null making base case implicitly when current Node is null
		if(current != null)
		{
			printInOrderRecursive(current.getLeftChild()); // left
			System.out.println(current.getName()); // parent
			printInOrderRecursive(current.getRightChild()); // right
		}
	}// END printInOrderRecursive METHOD
	
	// Method that searches for the Node with the name given and returns that Nodes phone number
	public String search(String name)
	{
		Node reference = searchRecursive(getRoot(), name);
		
		if(reference != null)
		{
			return reference.getPhoneNumber();
		}
		
		return "Unable to find " + name;
	}
	
	// Recursive method that helps the search method
	private Node searchRecursive(Node current, String name)
	{
		if(name.equalsIgnoreCase(current.getName()))
		{
			return current;
		}
		else if(name.compareToIgnoreCase(current.getName()) < 0)
		{
			return searchRecursive(current.getLeftChild(), name);
		}
		else if(name.compareToIgnoreCase(current.getName()) > 0)
		{
			return searchRecursive(current.getRightChild(), name);
		}
		else
		{
			return null;
		}
	}
	
	// Non-Recursive search method that helps the search method
	private Node searchNonRecursive(Node current, String name)
	{
		while(current != null)
		{
			if(name.equalsIgnoreCase(current.getName()))
			{
				return current;
			}
			else if(name.compareToIgnoreCase(current.getName()) < 0)
			{
				current = current.getLeftChild();
			}
			else
			{
				current = current.getRightChild();
			}
		}
		
		return null;
	}
	
}
