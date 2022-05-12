package ex1MySavings;

public class Total 
{
	//private static final double PI = 3.14;
	private double total;
	//Tester Calls upon these "FUNCTIONS" to produce answer.
	//Sorta Acts like an import "EXAMPLE = Scanner".
	
	
	public Total()
	{
		total = 1;  
	}
	
	public Total(int r)
	{
		total = r;  
	}
	
	public void setTotal(double newTotal)
	{
		total = newTotal;  
	}
	
	public double getTotal()
	{
		 return(total);  
	}
	
}
