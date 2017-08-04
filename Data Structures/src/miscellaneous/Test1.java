package miscellaneous;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Test1 extends JFrame
{
 public Test1()
 {
  String sampleText = new String();
  
  for(int i = 0; i < 250; i++)
   sampleText += Integer.toString(i) + "\n";
  
  JButton done = new JButton("Done");
  JTextArea textArea = new JTextArea();
  JScrollPane scrollPane = new JScrollPane(textArea);
  JPanel buttonPanel = new JPanel();
  JLabel theLabel = new JLabel("List Contents:");
  
  textArea.setEditable(false);
  textArea.setText(sampleText);
  
  setSize(500, 500);
  setTitle("Test Window");
  setVisible(true);
  
  done.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
    dispose();
    mainMenu();
   }
  });
  
  this.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent e)
   {
    dispose();
    mainMenu();
   }
  });
  
  buttonPanel.add(done);
  
  add(theLabel, BorderLayout.PAGE_START);
  add(scrollPane, BorderLayout.CENTER);
  add(buttonPanel, BorderLayout.PAGE_END); 
 }
 
 public static void mainMenu()
 {
  String[] options = {"Display", "Exit"};
  int choice = JOptionPane.showOptionDialog(null, "Make selection", "Main Menu", 0, 1, null, options, 0);
    
  switch(choice)
  {
  case 0:
   Test1 whatever = new Test1();
   break;
  case 1:
   System.exit(0);
   break;
  }
 }
 
 public static void main(String[] args)
 {
  mainMenu();
 }
}
