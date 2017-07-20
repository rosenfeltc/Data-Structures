package miscellaneous;

import javax.swing.JOptionPane;

public class AverageTemperature
{
	public static void main(String[] args)
	{
		float[] temperatures = new float[7];
		String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		String temp;
		float sumTemperature = 0;
		
		for(int i = 0; i < temperatures.length; i++)
		{
			temp = JOptionPane.showInputDialog("Please enter temperature for " + week[i] + ".");
			temperatures[i] = Float.parseFloat(temp);
			
			JOptionPane.showMessageDialog(null, week[i] + "\nEntered temperature = " + temperatures[i]);
		}
		
		for(int i = 0; i < temperatures.length; i++)
		{
			sumTemperature += temperatures[i];
		}
			
		JOptionPane.showMessageDialog(null, "The average temperature this week was " + sumTemperature / temperatures.length);
	}
}
