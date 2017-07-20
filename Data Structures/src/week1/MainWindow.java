package week1;

import javax.swing.JOptionPane;

public class MainWindow 
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name + "!");
	}
}
