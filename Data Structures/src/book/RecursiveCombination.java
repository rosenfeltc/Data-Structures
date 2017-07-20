/* Doesn't give the right answer for combination, the book problem about Spock and planets may be solving something different than
 * the combination formula */

package book;

public class RecursiveCombination 
{
	public static int combination(int n, int k)
	{
		if((k == 0) || (k == 1))
		{
			return 1;
		}
		else if(k > n)
		{
			return 0;
		}
		else
		{
			return combination(n-1, k-1) + combination(n-1,k);
		}
	}
	
	public static void main(String[] args)
	{
		int n = 6;
		int k = 3;
		
		System.out.println("The solution to " + n + " choose " + k + " is " + combination(n, k));
	}
}
