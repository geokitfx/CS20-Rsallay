package ex1MySavings;

public class Total 
{
	//private static final double PI = 3.14;
	private double total;
	//Tester Calls upon these "FUNCTIONS" to produce answer.
	//Sorta Acts like an import "EXAMPLE = Scanner".
	
	
	public Total()
	{
		total = 0;  
	}
	
	public double getTotal()
	{
		 return(total);  
	}
	
	public void addDeposit(double amt)
	{
		total += amt;	
	}
	
	public void getWithdrawl(double amt)
	{
		if (amt <= total) {
			total -= amt;
		}
	}
	
	public String toStringWithNot()
	{
		String totalString;
		totalString = "Not enough money to withdraw";
		return(totalString);
	}
	
}
