package Circle3;
/*

Program: Circle3.java          Last Date of this Revision: 05, 18, 2022

Purpose: Modify the Circle class to include a class method named [displayAreaFormula], as shown in the previous section.
		 Modify existing client code to test the new method.

Author: Rowan Sallay, 
School: CHHS
Course: Computer Programming 20
 

*/

public class Circle3 {

	public static void main(String[] args) 
	{
		CircleFUNC3 spotA = new CircleFUNC3();
		spotA.setRadius(3);
		
		CircleFUNC3 spotB = new CircleFUNC3(5);
		
		System.out.println("Circle Radius: "+ spotA.getRadius());
		System.out.println("Circle circumference: "+ spotA.circumference());
		CircleFUNC3.displayAreaFormula();
		System.out.println(" ");
		System.out.println("Circle Radius: "+ spotB.getRadius());
		System.out.println("Circle circumference: "+ spotB.circumference());
		CircleFUNC3.displayAreaFormula();
		
	}

}

/* Screen Dump

Circle Radius: 3.0
Circle circumference: 18.84955592153876
The formula for the area of a circle is A = Pi * R * R
 
Circle Radius: 5.0
Circle circumference: 31.41592653589793
The formula for the area of a circle is A = Pi * R * R

*/
