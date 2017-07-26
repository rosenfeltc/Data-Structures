package week3;

public class SearchLL 
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
	
	public Node search(int toFind)
	{
		Node searcher = root;
		
		while(searcher != null)
		{
			if(searcher.data == toFind)
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
	
	public static void main(String[] args)
	{
		SearchLL theList = new SearchLL();
		
		theList.search(2);
	}
}
