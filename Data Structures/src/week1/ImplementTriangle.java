package week1;

public class ImplementTriangle
{
	public static void main(String[] args)
	{
		Triangle testTriangle = new Triangle();
		Triangle testTriangle2 = new Triangle(3, 3, 3, 60, 60, 60);
		Triangle testTriangle3 = new Triangle(1, 2, 35, 55);
		
		testTriangle3.setAngleC(90);
		
		testTriangle.setSideA(10);
		testTriangle.setSideB(20);
		
		double triangle3sideB = testTriangle3.getSideB();
	}
}
