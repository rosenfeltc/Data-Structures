package miscellaneous;

public class Permutations 
{
	public static void main(String[] args)
	{
		char[] myString = {'L', 'I', 'V', 'E'};
		
		permute(myString, myString.length);
	}
	
	public static void permute(char[] a, int l)
	{
		if(l == 1)
		{
			System.out.println(a);
			return;
		}
		for(int i = 0; i < l; i++)
		{
			swap(a, i, l - 1);
			permute(a, l - 1);
			swap(a, i, l - 1);
		}
	}
	
	public static void swap(char[] a, int i, int j)
	{
		char temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
