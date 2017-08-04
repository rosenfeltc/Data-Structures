package week4;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Board1 extends JPanel
{
	public Board1()
	{
		setPreferredSize(new Dimension(600, 600));
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawRect(50, 40, 150, 150);
		g.drawRect(50, 190, 150, 150);
		g.drawRect(50, 340, 150, 150);
		g.drawRect(200, 40, 150, 150);
		g.drawRect(200, 190, 150, 150);
		g.drawRect(200, 340, 150, 150);
		g.drawRect(350, 40, 150, 150);
		g.drawRect(350, 190, 150, 150);
		g.drawRect(350, 340, 150, 150);
		g.drawOval(60, 50, 130, 130);
		g.drawOval(210, 200, 130, 130);
		g.drawOval(360, 350, 130, 130);
		g.drawOval(210, 350, 130, 130);
		g.drawOval(60, 350, 130, 130);
		g.drawLine(220, 170, 330, 60);
		g.drawLine(220, 60, 330, 170);
		g.drawLine(370, 170, 480, 60);
		g.drawLine(370, 60, 480, 170);
		g.drawLine(70, 320, 180, 210);
		g.drawLine(70, 210, 180, 320);
		g.drawLine(370, 320, 480, 210);
		g.drawLine(370, 210, 480, 320);
	}
}
