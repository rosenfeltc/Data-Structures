package week2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import java.util.Random;

public class MultipleCircles extends JPanel
{
	private Random generator = new Random();
	private int howMany;
	
	public MultipleCircles(int howMany)
	{
		this.howMany = howMany;
		JFrame theFrame = new JFrame();
		theFrame.setTitle("Many circles!");
		theFrame.setSize(500, 500);
		theFrame.setVisible(true);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.add(this);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(int i = 0; i < howMany; i++)
		{
			g.setColor(new Color(generator.nextFloat(), generator.nextFloat(), generator.nextFloat()));
			g.drawOval(generator.nextInt() % 101 + 40, generator.nextInt() % 101 + 40, 275, 275);
		}
	}
	
	public static void main(String[] args)
	{
		int howMany = Integer.parseInt(JOptionPane.showInputDialog("Enter how many circles"));
		MultipleCircles makeCircles = new MultipleCircles(howMany);
	}
}
