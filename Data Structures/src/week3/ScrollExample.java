package week3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ScrollExample extends JFrame
{
	public ScrollExample()
	{
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(fileChooser);
		
		File theFile = fileChooser.getSelectedFile();
		String theString = new String();
		
		try
		{
			Scanner fileScanner = new Scanner(theFile);
			while(fileScanner.hasNextLine())
			{
				theString += fileScanner.nextLine() + "\n";
			}
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "Error opening file! Exiting program...");
			System.exit(1);
		}
		
		JTextArea textArea = new JTextArea(theString);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		add(scrollPane);
		
		setSize(500, 500);
		setTitle("Example of JScrollPane");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		ScrollExample theWindow = new ScrollExample();
	}
}
