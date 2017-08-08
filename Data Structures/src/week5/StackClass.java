package week5;

public class StackClass 
{
	public static void main(String[] args)
	{
		Stack theStack = new Stack();
		
		theStack.push(15);
		theStack.push(12);
		theStack.push(4);
		theStack.push(9);
		
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.peek());
	}
}
