// URLs for images:
//
// Batman - https://upload.wikimedia.org/wikipedia/en/1/17/Batman-BenAffleck.jpg	
// Flash - https://images.moviepilot.com/image/upload/c_fill,h_470,q_auto:good,w_620/bamqmezu89lxwvfc2nyq.jpg
// Superman - https://static.comicvine.com/uploads/original/11111/111113523/3605753-1936874063-31646.png
// Tolga Soyata - http://tolgasoyata.com/images/tolga_photo.jpg

package week4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;

public class SimpleJRadioButton extends JFrame
{
	public SimpleJRadioButton()
	{
		JRadioButton radio1 = new JRadioButton("Batman");
		JRadioButton radio2 = new JRadioButton("Flash");
		JRadioButton radio3 = new JRadioButton("Superman");
		JRadioButton radio4 = new JRadioButton("Wonder Woman");
		JRadioButton radio5 = new JRadioButton("Spiderman");
		JRadioButton radio6 = new JRadioButton("Power Rangers");
		ButtonGroup buttonGroup = new ButtonGroup();
		JButton display = new JButton("Display");
		JButton tolga = new JButton("Tolga");
		JPanel radioPanel1 = new JPanel();
		JPanel radioPanel2 = new JPanel();
		JPanel theRadioButtons = new JPanel();
		JPanel buttonPanel = new JPanel();
		JLabel theLabel = new JLabel("Display your favorite superhero!", JLabel.CENTER);
		
		buttonGroup.add(radio1);
		buttonGroup.add(radio2);
		buttonGroup.add(radio3);
		buttonGroup.add(radio4);
		buttonGroup.add(radio5);
		buttonGroup.add(radio6);
		
		radioPanel1.add(radio1);
		radioPanel1.add(radio2);
		radioPanel1.add(radio3);

		radioPanel2.add(radio4);
		radioPanel2.add(radio5);
		radioPanel2.add(radio6);
		
		theRadioButtons.setLayout(new GridLayout(2, 1));
		theRadioButtons.add(radioPanel1);
		theRadioButtons.add(radioPanel2);
		
		buttonPanel.add(display);
		buttonPanel.add(tolga);
		
		theLabel.setBackground(Color.MAGENTA);
		theLabel.setOpaque(true);
		theLabel.setFont(new Font("Comic Sans MS", 1, 20));
		theLabel.setForeground(Color.YELLOW);
		
		add(theLabel, BorderLayout.PAGE_START);
		add(theRadioButtons, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.PAGE_END);
		
		display.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JLabel whereSuperGoes = new JLabel();
				String theString = "<HTML><BODY>";
				JFrame secondFrame = new JFrame("Your hero");
				
				if(radio1.isSelected())
				{
					theString += "<IMG SRC=\"https://upload.wikimedia.org/wikipedia/en/1/17/Batman-BenAffleck.jpg\"</BODY></HTML>";
					whereSuperGoes.setText(theString);
					secondFrame.add(whereSuperGoes);
					secondFrame.setSize(500, 500);
					secondFrame.setVisible(true);
					
					secondFrame.addWindowListener(new WindowAdapter()
					{
						public void windowClosing(WindowEvent e)
						{
							secondFrame.dispose();
						}
					});
				}
				else if(radio2.isSelected())
				{
					theString += "<IMG SRC=\"https://images.moviepilot.com/image/upload/c_fill,h_470,q_auto:good,w_620/bamqmezu89lxwvfc2nyq.jpg\"</BODY></HTML>";
					whereSuperGoes.setText(theString);
					secondFrame.add(whereSuperGoes);
					secondFrame.setSize(500, 500);
					secondFrame.setVisible(true);
					
					secondFrame.addWindowListener(new WindowAdapter()
					{
						public void windowClosing(WindowEvent e)
						{
							secondFrame.dispose();
						}
					});
				}
				else if(radio3.isSelected())
				{
					theString += "<IMG SRC=\"https://static.comicvine.com/uploads/original/11111/111113523/3605753-1936874063-31646.png\"</BODY></HTML>";
					whereSuperGoes.setText(theString);
					secondFrame.add(whereSuperGoes);
					secondFrame.setSize(1500, 1500);
					secondFrame.setVisible(true);
					
					secondFrame.addWindowListener(new WindowAdapter()
					{
						public void windowClosing(WindowEvent e)
						{
							secondFrame.dispose();
						}
					});
				}
				else if(radio4.isSelected())
				{
					JOptionPane.showMessageDialog(null, "I don't have wonderwoman :(");
				}
				else if(radio5.isSelected())
				{
					JOptionPane.showMessageDialog(null, "I don't have Spiderman :(");
				}
				else if(radio6.isSelected())
				{
					JOptionPane.showMessageDialog(null, "I don't have the Power Rangers :(");
				}
				else
				{
					
					JOptionPane.showMessageDialog(null, "Must select a button");
				}
			}
		});
		
		tolga.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	
				JLabel whereSuperGoes = new JLabel();
				JFrame secondFrame = new JFrame("Your hero");
				String theString = "<HTML><BODY><IMG SRC=\"http://tolgasoyata.com/images/tolga_photo.jpg\"</BODY></HTML>";
				whereSuperGoes.setText(theString);
				secondFrame.add(whereSuperGoes);
				secondFrame.setSize(300, 400);
				secondFrame.setVisible(true);
				
				secondFrame.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						secondFrame.dispose();
					}
				});
			}
		});
		
		setTitle("Superheros");
		setSize(400, 175);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		SimpleJRadioButton theWindow = new SimpleJRadioButton();
	}
}