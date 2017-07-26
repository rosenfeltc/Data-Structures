package week3;

public class DeleteNodeLL 
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
	
	public void delete(int toDelete)
	{
		Node forDeletion = search(toDelete);
		
		if(forDeletion == null)
		{
			return;
		}
		else if(forDeletion == root)
		{
			root = root.next;
		}
		else
		{
			Node deleter = root;
			
			while(deleter.next != null)
			{
				if(deleter.next == forDeletion)
				{
					deleter.next = deleter.next.next;
				}
			}
		}
	}
	
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
}
