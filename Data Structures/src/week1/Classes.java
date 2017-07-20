package week1;

public class Classes
{
	private int a;
	private int b;
	private int c;
	
	public Classes()
	{
		a = 0;
		b = 0;
		c = 0;
	}
	
	public Classes(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int sum()
	{
		return (this.a + this.b + this.c);
	}
	
	public int product()
	{
		return (this.a * this.b * this.c);
	}
}
