package week1;

public class Assignment
{
	public static void main(String[] args)
	{
		boolean flag;
		char letter;
		byte number1;
		short number2;
		int number3;
		long number4;
		float number5;
		double number6;
		
		flag = true;
		letter = 'a';
		number1 = 127;
		number2 = -32768;
		number3 = 2147483647;
		number4 = (long) (Math.pow(2, 63) - 1);
		number5 = (float) (Math.pow(2, -149));
		number6 = (double) (Math.pow(2, -1074));
	}
}