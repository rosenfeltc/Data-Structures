package week3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class SaveFile 
{
	public static void main(String[] args)
	{
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		File toSave;
		String temp;
		String theString = "This is the String that will be saved to a file.";
		
		JOptionPane.showMessageDialog(null, "This program will save the String \"the String\" as a .txt file");
		fileChooser.showSaveDialog(fileChooser);
		toSave = fileChooser.getSelectedFile();
		temp = toSave.toString() + ".txt";
		toSave = new File(temp);
		
		try
		{
			PrintWriter theWriter = new PrintWriter(toSave);
			theWriter.print(theString);
			theWriter.close();
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "Error writing to file!");
		}
	}
}
