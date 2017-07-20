package week2;

public class ArraySearch 
{
	public static void main(String[] args)
	{
		int[] theArray = {1, 2, 3, 4, 5, 4, 3, 2, 1};
		
		System.out.println("The maximum element in the array is " + arraySearch(theArray, theArray.length - 1));
	}
	
	public static int arraySearch(int[] theArray, int index)
	{
		if(index > 0)
		{
			return (Math.max(theArray[index], arraySearch(theArray, index - 1)));
		}
		return theArray[0];
	}
}
