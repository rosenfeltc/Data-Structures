package week3;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class OpenFile 
{
	public static void main(String[] args)
	{
		JFileChooser fileChooser = new JFileChooser();
		
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result = fileChooser.showOpenDialog(fileChooser);
		
		if(result == JFileChooser.APPROVE_OPTION)
		{
			File toOpen = fileChooser.getSelectedFile();
			JOptionPane.showMessageDialog(null, "File opened: " + toOpen.getAbsolutePath());
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Error opening file!");
		}
	}
}
