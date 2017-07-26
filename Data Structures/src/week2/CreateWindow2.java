// Creating a window by extending the JFrame class
package week2;

import javax.swing.JFrame;

public class CreateWindow2 extends JFrame
{
	public CreateWindow2()
	{
		setTitle("A blank window");
		setSize(700, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		CreateWindow2 theWindow = new CreateWindow2();
	}
}
