package week1;

public class StringExample 
{
	public static void main(String[] args)
	{
		String message1 = "Hello, ";
		String message2 = "World!";
		
		String helloWorld = message1 + message2;
		
		int lengthMsg1 = message1.length();
		int lengthMsg2 = message2.length();
		int lengthHelloW = helloWorld.length();
		
		if(helloWorld.compareTo(message1 + message2) == 0)
		{
			System.out.println("They're the same!");
		}
		else
		{
			System.out.println("They're not the same!");
		}
	}
}
