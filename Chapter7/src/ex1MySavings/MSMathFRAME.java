package ex1MySavings;

//USE MySavingsGUI.java to run program!
//USE MySavingsGUI.java to run program!
//USE MySavingsGUI.java to run program!

public class MSMathFRAME 
{
	private double Total;
	//Tester Calls upon these "FUNCTIONS" to produce answer.
	//Sorta Acts like an import "EXAMPLE = Scanner".
	
	public MSMathFRAME()
	{
		Total = 0;
	}
	
	public MSMathFRAME(double tot)
	{
		Total = tot;
	}
	
	public double getTotal()
	{
		return Total; 
	}
	
	public void addTot(double amt)
	{
		Total = Total + amt; 
	}
	
	public void subTot(double amt)
	{
		if (amt <= Total) 
		{ Total = Total - amt; }
		else
		{System.out.println("Insufficient Balance.");}
	}
}
