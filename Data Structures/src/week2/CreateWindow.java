// Creating a graphic window without extending the JFrame class
package week2;

import javax.swing.JFrame;

public class CreateWindow 
{
	JFrame theFrame;
	
	public CreateWindow()
	{
		theFrame = new JFrame();
		theFrame.setTitle("A blank window");
		theFrame.setSize(700, 700);
		theFrame.setVisible(true);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		CreateWindow theWindow = new CreateWindow();
	}
}
