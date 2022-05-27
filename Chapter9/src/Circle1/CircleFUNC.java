package Circle1;

//USE Adder.java to run program!
//USE Adder.java to run program!
//USE Adder.java to run program!

public class CircleFUNC 
{
	private double radius;
	//Tester Calls upon these "FUNCTIONS" to produce answer.
	//Sorta Acts like an import "EXAMPLE = Scanner".
	
	
	public CircleFUNC()
	{
		radius = 1;  
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
