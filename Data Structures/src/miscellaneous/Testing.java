package miscellaneous;

public class Testing 
{
	public static void main(String[] args)
	{
		String one = "Monroe";
		String two = "Madison";
		String three = "Washington";
		String four = "Harrison";
		String five = "Harrison";
		
		System.out.println(Math.abs(one.compareToIgnoreCase(two)));
		System.out.println(Math.abs(one.compareToIgnoreCase(three)));
		
		int index = 0;
		while(!(four.equalsIgnoreCase(five)) && four.charAt(index) == five.charAt(index))
		{
			index++;
		}
		
		System.out.println(index);
	}
}
