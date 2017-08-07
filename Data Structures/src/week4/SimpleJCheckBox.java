package week4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SimpleJCheckBox extends JFrame 
{
	public static void main(String[] args)
	{
		SimpleJCheckBox window = new SimpleJCheckBox();
	}
	
	private int theNumber;
	private boolean box1, box2;
	
	private void setBox1(boolean box1)
	{
		this.box1 = box1;
	}
	
	private boolean getBox1()
	{
		return this.box1;
	}
	
	private void setBox2(boolean box2)
	{
		this.box2 = box2;
	}
	
	private boolean getBox2()
	{
		return this.box2;
	}
	
	private void setNumber(int theNumber)
	{
		this.theNumber = theNumber;
	}
	
	public String getNumber()
	{
		return Integer.toString(this.theNumber);
	}
	
	private boolean doubleTheNumber()
	{
		if(this.theNumber >= (int) 2147483647 / 2)
		{
			return false;
		}
		
		this.theNumber *= 2;
		return true;
	}
	
	private boolean squareTheNumber()
	{
		if(this.theNumber >= 46340)
		{
			return false;
		}
		
		this.theNumber *= this.theNumber;
		return true;
	}
	
	public SimpleJCheckBox()
	{
		setNumber(1);
		setBox1(false);
		setBox2(false);
		JLabel theLabel = new JLabel(getNumber(), JLabel.CENTER); // creating a JLabel
		JPanel bottomPanel = new JPanel();
		JButton calcButton = new JButton("Calculate"); // creating a JButton
		JButton reset = new JButton("Reset");
		JPanel buttonPanel = new JPanel(); // creating a JPanel for visual purpose (buttons)
		JCheckBox check1 = new JCheckBox("Double");
		JCheckBox check2 = new JCheckBox("Square");
		
		// Adding JCheckBoxes to a JPanel
		buttonPanel.add(check1);
		buttonPanel.add(check2);
		
		// Adding JButtons to a JPanel
		bottomPanel.add(calcButton);
		bottomPanel.add(reset);
		
		// Adding "actionable event" to the JCheckBox
		check1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setBox1(check1.isSelected());
			}
		});
		
		// A different way to do it
		check2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(check2.isSelected())
				{
					setBox2(true);
				}
				else
				{
					setBox2(false);
				}
			}
		});
		
		// Adding "actionable event" to the JButtons
		
		calcButton.addActionListener(new ActionListener()
		{
			private void overflowAlert()
			{
				theLabel.setForeground(Color.RED);
				theLabel.setText("Overflow >:(");				
				theLabel.setForeground(Color.BLUE);
			}
			public void actionPerformed(ActionEvent e)
			{
				// We want to check which checkbox(es) has/have checks, then perform
				// the actions. Overflow at 2147483647
				
				if(getBox1() && !getBox2())
				{
					if(doubleTheNumber())
					{
						theLabel.setText(getNumber());
					}
					else
					{
						overflowAlert();
					}
				}
				else if(!getBox1() && getBox2())
				{
					if(squareTheNumber())
					{
						theLabel.setText(getNumber());
					}
					else
					{
						overflowAlert();
					}
				}
				else if(getBox1() && getBox2())
				{
					if(doubleTheNumber() && squareTheNumber())
					{
						theLabel.setText(getNumber());
					}
					else
					{
						overflowAlert();
					}
				}
				else
				{
					theLabel.setText("You didn't fool me");
					JOptionPane.showMessageDialog(null, "You didn't select a box!");
				}
			}
		});
		
		reset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setNumber(1);
				theLabel.setText(getNumber());
			}
		});
		
		// A little fancy:
		theLabel.setFont(new Font("Comic Sans MS", 1, 20)); // set JLabel font
		theLabel.setBackground(Color.WHITE); // set JLabel background color
		theLabel.setForeground(Color.BLUE); // set JLabel text color
		theLabel.setOpaque(true); // make JLabel background visible
		
		add(theLabel, BorderLayout.PAGE_START); // Placing the JLabel on JFrame
		add(buttonPanel, BorderLayout.CENTER); // Placing the JPanel on JFrame
		add(bottomPanel, BorderLayout.PAGE_END); // Placing the JButtons on JFrame
		
		// Setting JFrame defaults:
		setSize(500, 500);
		setResizable(false);
		setTitle("Simple JButton Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
