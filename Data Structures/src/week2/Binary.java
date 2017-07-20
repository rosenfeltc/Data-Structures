package week2;

public class Binary 
{
	public static void main(String[] args)
	{
		int[] theArray = {1, 2, 3, 4, 5, 6};
		
		System.out.println("The number 7 is in the array: " + binSearch(theArray, 0, theArray.length, 7));
		System.out.println("The number 2 is in the array: " + binSearch(theArray, 0, theArray.length, 2));
	}
	
	public static boolean binSearch(int[] toSearch, int l, int r, int x)
	{
		int mid = (l + r) / 2;
		if(l > r)
		{
			return false;
		}
		else if(toSearch[mid-1] == x)
		{
			return true;
		}
		else if(toSearch[mid-1] < x)
		{
			return binSearch(toSearch, mid + 1, r, x);
		}
		else
		{
			return binSearch(toSearch, l, mid - 1, x);
		}
	}
}
