package week2;

public class SmallestItem
{
	public static void main(String[] args)
	{
		int[] theArray = {0, -2, -21, 1, 2, 3, 4, 5, 4, 3, 2, 1, -20};
		
		System.out.println("The smallest element in the array is " + arraySearch(theArray, theArray.length - 1));
	}
	
	public static int arraySearch(int[] theArray, int index)
	{
		if(index > 0)
		{
			return (Math.min(theArray[index], arraySearch(theArray, index -1)));
		}
		return theArray[0];
	}
}
