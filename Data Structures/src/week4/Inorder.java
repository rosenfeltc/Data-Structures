package week4;

public class Inorder 
{
	// Node Class
	private class Node
	{
		// Fields
		private int data;
		private int counter;
		private Node left;
		private Node right;
		private Node parent;
		
		// Constructor
		public Node(int data)
		{
			this.data = data;
			this.counter = 1;
			this.left = null;
			this.right = null;
			this.parent = null;
		}
		
		// Data Getter
		public int getData()
		{
			return this.data;
		}
		
		// Data Setter
		public void setData(int data)
		{
			this.data = data;
		}
		
		// Counter Getter
		public int getCounter()
		{
			return this.counter;
		}
		
		// Counter Setter
		public void setCounter(int counter)
		{
			this.counter = counter;
		}
		
		// Left Getter
		public Node getLeft()
		{
			return this.left;
		}
		
		// Left Setter
		public void setLeft(Node left)
		{
			this.left = left;
		}
		
		// Right Getter
		public Node getRight()
		{
			return this.right;
		}
		
		// Right Setter
		public void setRight(Node right)
		{
			this.right = right;
		}
		
		// Parent Getter
		public Node getParent()
		{
			return this.parent;
		}
		
		// Parent Setter
		public void setParent(Node parent)
		{
			this.parent = parent;
		}
	}
	
	// Field
	private Node root;
	
	// Constructor
	public Inorder()
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
	
	// Traversal method helper
	public void inorder()
	{
		inorder(getRoot());
	}
	
	// Recursive inorder Traversal method
	public void inorder(Node current)
	{
		if(current != null)
		{
			inorder(current.getLeft());
			System.out.print(current.getData() + " ");
			inorder(current.getRight());
		}
	}
}
