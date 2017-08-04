package week4;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class TicTacToe
{
	private static JPanel panel1;
	private static JPanel panel2;
	private static JFrame theFrame;
	
	public TicTacToe()
	{
		theFrame = new JFrame();
		panel1 = new Board1();
		panel2 = new Board2();
		theFrame.setLayout(new FlowLayout());
		theFrame.add(panel2);
		theFrame.add(panel1);
		theFrame.setSize(600, 600);
		theFrame.setTitle("Animated Tic Tac Toe!");
		theFrame.setVisible(true);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void changeState(int state)
	{
		switch(state)
		{
			case 0:
				panel1.setVisible(true);
				panel2.setVisible(false);
				theFrame.repaint();
				break;
			case 1:
				panel1.setVisible(false);
				panel2.setVisible(true);
				theFrame.repaint();
				break;
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		TicTacToe letsDoIt = new TicTacToe();
		
		for(int i = 0; i < 1000; i++)
		{
			changeState(i % 2);
			Thread.sleep(750);
		}
	}
}
