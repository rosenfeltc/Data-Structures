package week4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleJButton extends JFrame 
{
	public static void main(String[] args)
	{
		SimpleJButton window = new SimpleJButton();
	}
	private int theNumber;
	
	public SimpleJButton()
	{
		setNumber(0);
		JLabel theLabel = new JLabel(getNumber(), JLabel.CENTER); // creating a JLabel
		JButton incrementButton = new JButton("Increment"); // creating a JButton
		
		incrementButton.addActionListener(new ActionListener()
		{		
			public void actionPerformed(ActionEvent e)
			{
				incrementNumber();
				theLabel.setText(getNumber());
			}
		});
		
		add(theLabel, BorderLayout.PAGE_START); // Placing the JLabel on JFrame
		add(incrementButton, BorderLayout.PAGE_END); // Placing the JLabel on JFrame
		
		// a little fancy on the JLabel
		theLabel.setFont(new Font("Comic Sans MS", 1, 20)); // set JLabel Font
		theLabel.setBackground(Color.WHITE); // set JLabel background color
		theLabel.setForeground(Color.BLUE); // set JLabel text color
		theLabel.setOpaque(true); // make JLabel background visible
		
		// setting JFrame defaults
		setSize(500, 500);
		setTitle("Simple JButton Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	private void setNumber(int theNumber)
	{
		this.theNumber = theNumber;
	}
	
	public String getNumber()
	{
		return Integer.toString(this.theNumber);
	}
	
	private void incrementNumber()
	{
		this.theNumber++;
	}
}
