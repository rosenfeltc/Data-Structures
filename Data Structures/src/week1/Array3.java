package week1;

public class Array3
{
	public static void main(String[] args)
	{
		int[] exampleArray5 = {1, 2, 3, 4, 5, 6};
		
		int[] newArray = addOne(exampleArray5);
		
		print(exampleArray5);
		print(newArray);
	}
	
	public static int[] addOne(int[] numbers)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] += 1;
		}
		return numbers;
	}
	
	public static void print(int[] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + ", ");
		}
		System.out.println();
	}
}