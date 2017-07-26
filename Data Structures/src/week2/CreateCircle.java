package week2;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class CreateCircle extends JFrame
{
	public CreateCircle()
	{
		setTitle("A circle");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.drawOval(30, 45, 400, 400);
	}
	
	public static void main(String[] args)
	{
		CreateCircle theCircle = new CreateCircle();
	}
}
