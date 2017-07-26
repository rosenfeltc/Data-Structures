package week2;

import javax.swing.JFrame;
import java.awt.Graphics;

public class TicTacToe extends JFrame 
{
	public TicTacToe()
	{
		setTitle("Tic, Tac, Toe!");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		// The grid made up of squares
		g.drawRect(50, 40, 150, 150);
		g.drawRect(50,190, 150, 150);
		g.drawRect(50, 340, 150, 150);
		g.drawRect(200, 40, 150, 150);
		g.drawRect(200, 190, 150, 150);
		g.drawRect(200,340, 150, 150);
		g.drawRect(350, 40, 150, 150);
		g.drawRect(350, 190, 150, 150);
		g.drawRect(350, 340, 150, 150);
		
		// The O's
		g.drawOval(60, 50, 130, 130);
		g.drawOval(210, 200, 130, 130);
		g.drawOval(360, 350, 130, 130);
		g.drawOval(210, 350, 130, 130);
		g.drawOval(60, 350, 130, 130);
		
		// The X's
		g.drawLine(220, 170, 330, 60);
		g.drawLine(220, 60, 330, 170);
		g.drawLine(370, 170, 480, 60);
		g.drawLine(370, 60, 480, 170);
		g.drawLine(70, 320, 180, 210);
		g.drawLine(70, 210, 180, 320);
		g.drawLine(370, 320, 480, 210);
		g.drawLine(370, 210, 480, 320);
	}
	
	public static void main(String[] args)
	{
		TicTacToe newBoard = new TicTacToe();
	}
}
