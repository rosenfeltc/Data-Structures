package week1;

public class RightTriangle
{
	private double sideA;
	private double sideB;
	private double sideC;
	private double angleA;
	private double angleB;
	private double angleC = 90;
	
	public RightTriangle()
	{
		this.sideA = 0;
		this.sideB = 0;
		this.sideC = 0;
		this.angleA = 0;
		this.angleB = 0;
	}
	
	public RightTriangle(double a, double b, double A, double B)
	{
		this.sideA = a;
		this.sideB = b;
		this.sideC = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		this.angleA = A;
		this.angleB = B;
	}
	
	public double area()
	{
		return (0.5 * this.sideA * this.sideB);
	}
	
	public double perimeter()
	{
		return (this.sideA + this.sideB + this.sideC);
	}
	
	public static void main(String[] args)
	{
		RightTriangle testTriangle = new RightTriangle(3, 4, 30, 60);
		double testArea = testTriangle.area();
		double testPerimeter = testTriangle.perimeter();
		
		System.out.println("Area: " + testArea + ", Perimeter:" + testPerimeter);
	}
}