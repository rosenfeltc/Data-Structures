package miscellaneous;

public class Q 
{
	public static void main(String[] args)
	{
		int[][] myArray = {
		{1, 1, 1},
		{2, 4, 8},
		{3, 9, 27}
		};
		myMethod(myArray);
	}
	
	public static void myMethod(int[][] inputArr)
	{
		int results[] = new int[inputArr[0].length];
		int min;
		int max;
		for(int i = 0; i < inputArr[0].length;i++)
		{
			min = inputArr[i][0];
			max = 0;
			for(int j = 0; j < 3; j++)
			{
				if(inputArr[i][j] - min > max)
				{
					max = inputArr[i][j] - min;
				}
				if(inputArr[i][j] < min)
				{
					min = inputArr[i][j];
				}
			}
			results[i] = max;
		}
		System.out.print(results[0] + " " + results[1] + " " + results[2]);
	}
}
