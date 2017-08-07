package week4;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleAnimation extends JFrame
{
	public SimpleAnimation() throws InterruptedException
	{
		JLabel label1 = new JLabel();
		
		add(label1);

		setSize(500, 500);
		setTitle("Thread.sleep");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		for(int i = 0; i < 1000; i++)
		{
			if(i % 2 == 0)
			{
				label1.setBackground(Color.WHITE);
				label1.setOpaque(true);
				label1.setForeground(Color.BLUE);
				label1.setText("Hello " + i);
			}
			else
			{
				label1.setBackground(Color.BLACK);
				label1.setOpaque(true);
				label1.setForeground(Color.RED);
				label1.setText("Goodbye " + i);
			}
			
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		SimpleAnimation blinkingText = new SimpleAnimation();
	}
}