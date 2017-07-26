package week3;

public class InsertNodeLL 
{
	private class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	private Node root;
	
	public void insert(int data)
	{
		Node newNode = new Node(data);
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			newNode.next = root;
			root = newNode;
		}
	}
	
	public static void main(String[] args)
	{
		InsertNodeLL theList = new InsertNodeLL();
		theList.insert(1);
		theList.insert(2);
		theList.insert(3);
		theList.insert(4);
	}
}
