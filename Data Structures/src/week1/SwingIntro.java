package week1;

import javax.swing.JOptionPane;

public class SwingIntro 
{
	public static void main(String[] args)
	{
		double a;
		double b;
		double c;
		String sideA;
		String sideB;
		
		sideA = JOptionPane.showInputDialog("Please enter SIDE A of the right triangle");
		sideB = JOptionPane.showInputDialog("Please enter SIDE B of the right triangle");
		
		a = Double.parseDouble(sideA);
		b = Double.parseDouble(sideB);
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		JOptionPane.showMessageDialog(null, "The hypotenuse of the right triangle is " + c);
	}
}
