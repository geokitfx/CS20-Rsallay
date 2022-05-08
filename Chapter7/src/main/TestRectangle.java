package main;

public class TestRectangle 
{
	
	private double length, width;
	
	public TestRectangle() // Construction Method
	{
		length = 1; //default length
		width = 1;  //default width
	}
	
	public TestRectangle(double l, double w) // Construction Method2
	{
		length = l; //default length
		width = w;  //default width
	}
	
	public void setLength(double newLength)
	{
		length = newLength;
	}

	public void setWidth(double newWidth)
	{
		width = newWidth;
	}

	public double getLength()
	{
		return(length);
	}

	public double getWidth()
	{
		return(width);
	}

}
