package book;

public class Chapter1_Examples 
{
	public static void main(String[] args)
	{
		Integer intObject = 9;
		System.out.println(intObject.intValue());
		
		int x = intObject;
		
		System.out.println(x);
		
		String name = new String("Chris");
		System.out.println(name);
		
		System.out.println("Hello\nLet\'s get started!");
		
		String[] nameList = {"Janet", "Frank", "Mike", "Chris", "Doug", "Tom"};
		
		for(int i = 0; i < nameList.length; i++)
		{
			System.out.println(name.equals(nameList[i]));
		}
		
		String[] lastNames = {"Rosenfelt", "Boone", "Mouse"};
		for(int i = 0; i < lastNames.length; i++)
		{
			System.out.println(lastNames[i]);
		}
	}
}
