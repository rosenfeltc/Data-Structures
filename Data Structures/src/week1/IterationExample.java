package week1;

public class IterationExample 
{
	public static void main(String[] args)
	{
		int index = 0;
		
		while(index < 10)
		{
			if(index % 2 == 0)
			{
				index++;
				continue;
			}
			System.out.println(index);
			index++;
		}
		
		for(int i = 0; i < 10; i++)
		{
			if(i % 2 == 1)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
