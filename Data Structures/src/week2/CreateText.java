package week2;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CreateText extends JFrame
{
	public CreateText()
	{	
		setTitle("Some example text");
		setSize(500, 500);
		setLayout(new GridLayout(3, 1));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void addText(String theText)
	{
		JLabel theLabel = new JLabel(theText, JLabel.CENTER);
		add(theLabel);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		String theText = "<html><body>We can use HTML to format text! <font size=12k color=red><br>Like this!</font>" 
				+ "<br><span style=\"background-color: #FFFF00\">Or this!</span></body></html>";
		CreateText theWindow = new CreateText();
		theWindow.addText(theText);
	}
}
