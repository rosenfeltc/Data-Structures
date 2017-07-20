package week1;

public class GetterSetter 
{
	private int a;
	private int b;
	private int c;
	
	public GetterSetter()
	{
		a = 0;
		b = 0;
		c = 0;
	}
	
	public GetterSetter(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setA(int a)
	{
		this.a = a;
	}
	
	public int getA()
	{
		return this.a;
	}
	
	public void setB(int b)
	{
		this.b = b;
	}
	
	public int getB()
	{
		return this.b;
	}
	
	public void setC(int c)
	{
		this.c = c;
	}
	
	public int getC()
	{
		return this.c;
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
