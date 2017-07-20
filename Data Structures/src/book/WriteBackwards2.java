package book;

public class WriteBackwards2 
{
	public static void writeBackwards(String s)
	{
		if(s.length() == 0)
		{
			return;
		}
		else
		{
			writeBackwards(s.substring(1, s.length()));
			System.out.print(s.charAt(0) + " ");
		}
	}
	
	public static void main(String[] args)
	{
		String word = "Christopher";
		System.out.print("The word is " + word + "\nSpelled backwards: ");
		writeBackwards(word);
		
	}
}
