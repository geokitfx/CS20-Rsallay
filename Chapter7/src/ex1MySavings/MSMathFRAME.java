package ex1MySavings;

public class MSMathFRAME 
{
	//private static final double PI = 3.14;
	private double radius;
	//Tester Calls upon these "FUNCTIONS" to produce answer.
	//Sorta Acts like an import "EXAMPLE = Scanner".
	
	
	public MSMathFRAME()
	{
		radius = 1;  
	}
	
	public MSMathFRAME(int r)
	{
		radius = r;  
	}
	
	public void setRadius(double newRadius)
	{
		radius = newRadius;  
	}
	
	public double circumference()
	{
		double circCircumference;
		circCircumference = Math.PI * 2 * radius;
		return(circCircumference);
		
	}
	
	public double getRadius()
	{
		 return(radius);  
	}
	
}
