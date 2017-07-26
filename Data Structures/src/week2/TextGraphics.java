package week2;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextGraphics extends JFrame
{
	public TextGraphics()
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
		String theText = "<html><body><center><br><br>I am taking <font color=red>ICSI - 213</font><br><br><b><i>at</b></i><br>"
				+ "<br><br><img src=\"http://www.albany.edu/biology/images/UA_logo/logo_A3_pms124_269.png\" "
				+ "height = 100 width = 300></body></html>";
		TextGraphics theWindow = new TextGraphics();
		theWindow.addText(theText);
	}
}
