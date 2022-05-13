package Circle4;

public class CircleFUNC4 
{
	//private static final double PI = 3.14;
	private double radius;
	//Tester Calls upon these "FUNCTIONS" to produce answer.
	//Sorta Acts like an import "EXAMPLE = Scanner".
	
	
	public CircleFUNC4()
	{
		radius = 1;  
	}
	
	public CircleFUNC4(int r)
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
