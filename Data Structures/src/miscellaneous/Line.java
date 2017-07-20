package miscellaneous;

import javax.swing.JOptionPane;

public class Line
{
	private double intercept;
	private double slope;
	
	public void readTheLine()
	{
		int index = 0;
		String equation = new String("");
		String a = new String("");
		String b = new String("");
		
		equation = JOptionPane.showInputDialog("Please enter the equation");
		
		for(; equation.charAt(index) != '='; index++)
			;
		
		index++;
		// skip =
		for(; equation.charAt(index) != 'x'; index++)
		{
			if(equation.charAt(index) == ' ')
			{
				continue;
			}
			else
			{
				a += equation.charAt(index);
			}
		}
		
		// skip x
		index++;
		for(; index< equation.length(); index++)
		{
			if(equation.charAt(index) == ' ')
			{
				continue;
			}
			else
			{
				b += equation.charAt(index);
			}
		}
		if(b == "")
		{
			intercept = 0;
			return;
		}
		
		intercept = Double.parseDouble(b);
		slope = Double.parseDouble(a);
		
	} // end method readTheLine
	
	public void solve(Line line)
	{
		if(this.slope - line.slope == 0)
		{
			JOptionPane.showMessageDialog(null,  "The lines are parallel");
		}
		else
		{
			double x = (line.intercept - this.intercept) /(this.slope - line.slope);
			double y = this.slope * x + this.intercept;
			
			//JOptionPane.showMessageDialog(null, ");
		}
	}
	public static void main(String[] args)
	{
		Line line1 = new Line();
		line1.readTheLine();
		
	}
}
