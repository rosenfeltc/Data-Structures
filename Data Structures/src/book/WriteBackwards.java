package book;

public class WriteBackwards 
{
	public static void writeBackwards(String s)
	{
		if(s.length() > 0)
		{
			System.out.print(s.charAt(s.length() - 1) + " ");
			
			writeBackwards(s.substring(0, s.length() - 1));
		}
	}
	
	public static void main(String[] args)
	{
		String word = "Christopher";
		System.out.print("The word is " + word + "\nSpelled backwards: ");
		writeBackwards(word);
		
	}
}
