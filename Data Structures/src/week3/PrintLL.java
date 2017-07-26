package week3;

public class PrintLL 
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
	
	public void print()
	{
		if(root == null)
		{
			System.out.println("The list is empty!");
		}
		else
		{
			Node printer = root;
			
			while(printer != null)
			{
				System.out.println(printer.data);
				printer = printer.next;
			}
		}
	}
	
	public static void main(String[] args)
	{
		PrintLL theList = new PrintLL();
		
		theList.print();
	}
}
