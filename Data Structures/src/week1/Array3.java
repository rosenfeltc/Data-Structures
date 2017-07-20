package week1;

public class Array3
{
	public static void main(String[] args)
	{
		int[] exampleArray5 = {1, 2, 3, 4, 5, 6};
		
		int[] newArray = addOne(exampleArray5);
	}
	
	public static int[] addOne(int[] numbers)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] += 1;
		}
		return numbers;
	}
}