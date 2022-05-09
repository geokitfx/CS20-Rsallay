package Circle1;

public class CircleFUNC 
{
	private static final double PI = 3.14;
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
		circCircumference = PI * 2 * radius;
		return(circCircumference);
		
	}
	
	public double getRadius()
	{
		 return(radius);  
	}
	
}
