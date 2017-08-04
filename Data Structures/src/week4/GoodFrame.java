package week4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GoodFrame extends JFrame 
{
	// Fields
	private JButton generateShapes;
	private JButton exit;
	private JLabel titleLabel;
	private JPanel thePanel;
	private JPanel bottomButtons;
	private JPanel sideButtons;
	private String[] dropDown = {"Oval", "Rectangle"};
	private JRadioButton radio1;
	private JRadioButton radio2;
	private JRadioButton radio3;
	private ButtonGroup radioGroup;
	private JCheckBox check1;
	private JCheckBox check2;
	private Color color;
	private int shape;
	private int style;
	String theShape;
	
	// Constructor
	public GoodFrame()
	{
		super("Draw Shapes!");
		
		thePanel = new JPanel();
		bottomButtons = new JPanel();
		sideButtons = new JPanel();
		thePanel.setPreferredSize(new Dimension(400, 600));
		radio1 = new JRadioButton("Red");
		radio2 = new JRadioButton("Blue");
		radio3 = new JRadioButton("Green");
		check1 = new JCheckBox("Outline");
		check2 = new JCheckBox("Fill");
		radioGroup = new ButtonGroup();
		
		titleLabel = new JLabel("<html><b><font size=14>Select Options "
				+ "to Draw Shapes</font></b></html>", (int) CENTER_ALIGNMENT);
		
		JComboBox theDropDown = new JComboBox(dropDown);
		
		generateShapes = new JButton("Generate");
		exit = new JButton("Exit Program");
		
		Container theContainer = getContentPane();
		
		bottomButtons.add(generateShapes, BorderLayout.WEST);
		bottomButtons.add(exit, BorderLayout.EAST);
		radioGroup.add(radio1);
		radioGroup.add(radio2);
		radioGroup.add(radio3);
		sideButtons.add(radio1);
		sideButtons.add(radio2);
		sideButtons.add(radio3);
		sideButtons.add(check1);
		sideButtons.add(check2);
		sideButtons.add(theDropDown);
		
		theContainer.add(bottomButtons, BorderLayout.SOUTH);
		theContainer.add(thePanel, BorderLayout.CENTER);
		theContainer.add(titleLabel, BorderLayout.NORTH);
		theContainer.add(sideButtons, BorderLayout.LINE_END);
		
		exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		
		generateShapes.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				boolean flag = true;
				thePanel.removeAll();
				theShape = theDropDown.getSelectedItem().toString();
				
				if(theShape.equals("Oval"))
				{
					shape = 0;
					
					if(check1.isSelected() && check2.isSelected())
					{
						style = 1;
					}
					else if(check1.isSelected())
					{
						style = 0;
					}
					else if(check2.isSelected())
					{
						style = 1;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Must select fill or outline!");
						flag = false;
					}
				}
				else
				{
					shape = 1;
					
					if(check1.isSelected() && check2.isSelected())
					{
						style = 1;
					}
					else if(check1.isSelected())
					{
						style = 0;
					}
					else if(check2.isSelected())
					{
						style = 1;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Must select fill or outline!");
						flag = false;
					}
				}
				
				if(radio1.isSelected())
				{
					color = Color.RED;
				}
				else if(radio2.isSelected())
				{
					color = Color.BLUE;
				}
				else if(radio3.isSelected())
				{
					color = Color.GREEN;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Must select a color!");
					flag = false;
				}
				if(flag)
				{
					paint(getGraphics(), color, shape, style);
				}
			}
		});
		
		setSize(600, 600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}// END CONSTRUCTOR
	
	public void paint(Graphics g, Color theColor, int theShape, int theStyle)
	{
		super.paint(g);
		g.setColor(theColor);
		switch(theShape)
		{
			case 0:
				if(theStyle == 0)
				{
					g.drawOval(200, 200, 200, 200);
				}
				else
				{
					g.fillOval(200, 200, 200, 200);
				}
				break;
			case 1:
				if(theStyle == 0)
				{
					g.drawRect(200, 200, 200, 200);
				}
				else
				{
					g.fillRect(200, 200, 200, 200);
				}
		}
	}
	
	public static void main(String[] args)
	{
		GoodFrame theWindow = new GoodFrame();
	}
}
