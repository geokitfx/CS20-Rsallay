package reverse;

//USE Reverse.java to run program!
//USE Reverse.java to run program!
//USE Reverse.java to run program!

public class ReverseFRAME 
{
	private double Total;
	private int arrayindexS = 10;
	//Tester Calls upon these "FUNCTIONS" to produce answer.
	//Sorta Acts like an import "EXAMPLE = Scanner".
	
	public ReverseFRAME()
	{
		Total = 0;
	}
	
	public ReverseFRAME(double tot)
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
	
	public void countDown(double amt)
	{
		for (int i = arrayindexS-1; i >= 0; i--)
		{
			System.out.println("Student "+ i +": "+ i);
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
