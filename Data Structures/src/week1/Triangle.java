package week1;

public class Triangle 
{
		protected double sideA;
		private double sideB;
		private double sideC;
		private double angleA;
		private double angleB;
		private double angleC;
		
		public Triangle()
		{
			this.sideA = 0;
			this.sideB = 0;
			this.sideC = 0;
			this.angleA = 0;
			this.angleB = 0;
			this.angleC = 0;
		}
		
		public Triangle(int a, int b)
		{
			this.sideA = a;
			this.sideB = b;
			this.sideC = 0;
		}
		
		public Triangle(double a, double b, double c, double A, double B, double C)
		{
			this.sideA = a;
			this.sideB = b;
			this.sideC = c;
			this.angleA = A;
			this.angleB = B;
			this.angleC = C;
		}
		
		public Triangle(double a, double b, double A, double B)
		{
			this.sideA = a;
			this.sideB = b;
			this.sideC = 0;
			this.angleA = A;
			this.angleB = B;
			this.angleC = 0;
		}
		
		public void setSideA(double a)
		{
			this.sideA = a;
		}
		
		public double getSideA()
		{
			return this.sideA;
		}
		
		public void setSideB(double b)
		{
			this.sideB = b;
		}
		
		public double getSideB()
		{
			return this.sideB;
		}
		
		public void setSideC(double c)
		{
			this.sideC = c;
		}
		
		public double getSideC()
		{
			return this.sideC;
		}
		
		public void setAngleA(double A)
		{
			this.angleA = A;
		}
		
		public double getAngleA()
		{
			return this.angleA;
		}
		
		public void setAngleB(double B)
		{
			this.angleB = B;
		}
		
		public double getAngleB()
		{
			return this.angleB;
		}
		
		public void setAngleC(double C)
		{
			this.angleC = C;
		}
		
		public double getAngleC()
		{
			return this.angleC;
		}
}
