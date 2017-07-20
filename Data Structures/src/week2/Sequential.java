package week2;

public class Sequential 
{
	public static void main(String[] args)
	{
		int[] theArray = {1, 2, 3, 4, 5, 6};
		
		System.out.println("The number 7 is in the array: " + sequentialSearch(theArray, 7, 0));
		System.out.println("The number 2 is in the array: " + sequentialSearch(theArray, 2, 0));
	}
	
	public static boolean sequentialSearch(int[] toSearch, int target, int index)
	{
		if(index < toSearch.length)
		{
			if(toSearch[index] == target)
			{
				return true;
			}
			else
			{
				return sequentialSearch(toSearch, target, index + 1);
			}
		}
		else
		{
			return false;
		}
	}
}
