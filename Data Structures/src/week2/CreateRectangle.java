package week2;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class CreateRectangle extends JFrame
{
	public CreateRectangle()
	{
		setTitle("A rectangle");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.drawRect(50, 90, 400, 200);
	}
	
	public static void main(String[] args)
	{
		CreateRectangle theRectangle = new CreateRectangle();
	}
}
