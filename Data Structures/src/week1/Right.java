package week1;

public class Right extends Triangle
{
	public Right(int a, int b)
	{
		super(a,b);
	}
	
	public void figureHypotenuse()
	{
		setSideC(Math.sqrt(Math.pow(getSideA(), 2) + Math.pow(getSideB(),2)));
	}
	
	public double hypotenuse()
	{
		if(getSideC() != 0)
		{
			return getSideC();
		}
		else
		{
			return Math.sqrt(Math.pow(getSideA(),2) + Math.pow(getSideB(),2));
		}
	}
	
	public double area()
	{
		return (0.5 * getSideA() * getSideB());
	}
}
